package com.poli.edu.aircombat.threads;

import com.poli.edu.aircombat.Main;
import com.poli.edu.aircombat.components.EnemyFire;
import com.poli.edu.aircombat.components.PaintGif;

import javax.swing.*;
import java.awt.*;

public class EnemyThread extends Thread {

    private Main main;
    private Dimension screenSize;
    private EnemyFire enemyFire;
    private int timeSleep;
    private JLayeredPane mainPanel;

    public EnemyThread(Main main, JLayeredPane mainPanel, int timeSleep){
        this.main = main;
        this.screenSize = this.main.getScreenSize();
        this.timeSleep = timeSleep;
        this.mainPanel = mainPanel;
    }

    @Override
    public void run() {
        while (true) {

            PaintGif enemyFireImage = new PaintGif("/img/enemy_shot/Imagen1.png");
            enemyFireImage.resizeByScreenPercentage(screenSize, 0.06, PaintGif.RESIZING_BY_HEIGHT);
            enemyFire = new EnemyFire(enemyFireImage.getImage(), screenSize);
            //System.out.println("Las dimensiones de las rocas son de " + enemyFireImage.getImage().getIconWidth() + "x" + enemyFireImage.getImage().getIconHeight());
            mainPanel.add(enemyFire);
            main.addEnemyFires(enemyFire);

            try {
                EnemyShotThread enemyShotThread = new EnemyShotThread(enemyFire, main, mainPanel);
                enemyShotThread.start();

                Thread.sleep(timeSleep);
            } catch (Exception exc) {
                System.out.println(exc.getMessage());
            }
            System.out.println(main.getEnemyFires().size());
        }
    }

}
