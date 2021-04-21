package com.poli.edu.aircombat.threads;

import com.poli.edu.aircombat.Main;
import com.poli.edu.aircombat.components.EnemyFire;

import javax.swing.*;
import java.awt.*;

public class EnemyShotThread extends Thread {

    private Main main;
    private EnemyFire enemyFire;
    private JLayeredPane mainPanel;

    public EnemyShotThread(EnemyFire enemyFire, Main main, JLayeredPane mainPanel) {
        this.enemyFire = enemyFire;
        this.main = main;
        this.mainPanel = mainPanel;
    }

    @Override
    public void run(){
        while (!enemyFire.isDelete()) {
            if(enemyFire.getX()-1 < 0) break;
            enemyFire.setLocation(enemyFire.getX()-1, enemyFire.getPosYEnemy());

            try {
                Thread.sleep(5);
            } catch (Exception exc) {
                System.out.println(exc.getMessage());
            }
        }

        main.getEnemyFires().remove(this.enemyFire);
        //System.out.println("Long del vector enemigo: "+main.getEnemyFires().size());
        mainPanel.remove((Component) enemyFire);
        mainPanel.repaint();
    }
}
