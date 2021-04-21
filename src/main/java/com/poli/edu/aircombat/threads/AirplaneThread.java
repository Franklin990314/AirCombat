package com.poli.edu.aircombat.threads;

import com.poli.edu.aircombat.Main;
import com.poli.edu.aircombat.components.AirplaneFire;
import com.poli.edu.aircombat.components.EnemyFire;
import com.poli.edu.aircombat.components.PaintGif;

import javax.swing.*;
import java.awt.*;

public class AirplaneThread extends Thread {

    private Main main;
    private Dimension screenSize;
    private AirplaneFire airplaneFire;
    private JLayeredPane mainPanel;
    private int posXAirplane;
    private int posYAirplane;

    public AirplaneThread(Main main, JLayeredPane mainPanel, int posX, int posY){
        this.main = main;
        this.screenSize = main.getScreenSize();
        this.mainPanel = mainPanel;
        this.posXAirplane = posX;
        this.posYAirplane = posY;
    }

    @Override
    public void run(){

        PaintGif airplaneFireImage = new PaintGif("/img/airplane_shot/shot.png");
        airplaneFireImage.resizeByScreenPercentage(screenSize, 0.06, PaintGif.RESIZING_BY_HEIGHT);

        airplaneFire = new AirplaneFire(airplaneFireImage.getImage(), screenSize, this.posXAirplane, this.posYAirplane);
        System.out.println("Las dimensiones del disparo son de " + airplaneFireImage.getImage().getIconWidth() + "x" + airplaneFireImage.getImage().getIconHeight());
        mainPanel.add(airplaneFire);
        main.addAirplaneFires(airplaneFire);

        while (airplaneFire.getX() < screenSize.getWidth()) {
            airplaneFire.setLocation(airplaneFire.getX() + 3, airplaneFire.getY());

            try {
                for (int i = 0; i < this.main.getAirplaneFires().size(); i++) {
                    AirplaneFire airplaneBullet = this.main.getAirplaneFires().get(i);

                    Rectangle recAirplaneShot = new Rectangle(airplaneBullet.getX(), airplaneBullet.getY(),
                            airplaneBullet.getWidth(), airplaneBullet.getHeight());

                    for (int j = 0; j < this.main.getEnemyFires().size(); j++) {
                        EnemyFire enemyBullet = this.main.getEnemyFires().get(j);

                        Rectangle recEnemyShot = new Rectangle(enemyBullet.getX(), enemyBullet.getY(),
                                enemyBullet.getWidth(), enemyBullet.getHeight());

                        if (recAirplaneShot.intersects(recEnemyShot)) {
                            this.main.getEnemyFires().get(j).setDelete(true);
                            System.out.println("ENTRE");
                        }
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("");
            }
            try {
                Thread.sleep(2);
            } catch (Exception e) {
            }

        }

        main.getAirplaneFires().remove(this.airplaneFire);

        mainPanel.remove((Component) airplaneFire);
        mainPanel.repaint();
    }
}
