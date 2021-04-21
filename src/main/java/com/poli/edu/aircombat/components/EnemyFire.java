package com.poli.edu.aircombat.components;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class EnemyFire extends JLabel {

    private Random randomNumber = new Random();
    private int posXEnemy;
    private int posYEnemy;
    private boolean isDelete;

    public EnemyFire(ImageIcon imageIcon, Dimension screenSize){
        try {
            this.setIcon(imageIcon);
            int number = randomNumber.nextInt((int) Math.round(screenSize.getHeight()));
            int x = (int) Math.round(screenSize.width);

            if (number < imageIcon.getIconHeight()/2) {
                number += imageIcon.getIconHeight();
                //System.out.println("new random: " + number);
            } else if (number > screenSize.getHeight()-imageIcon.getIconHeight()) {
                number -= imageIcon.getIconHeight();
                //System.out.println("new random: " + number);
            }

            this.posXEnemy = x;
            this.posYEnemy = number;
            this.setBounds(x, number, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        } catch (Exception exc){
            System.out.println(exc.getMessage());
        }
    }

    public int getPosXEnemy() {
        return posXEnemy;
    }

    public void setPosXEnemy(int posXEnemy) {
        this.posXEnemy = posXEnemy;
    }

    public int getPosYEnemy() {
        return posYEnemy;
    }

    public void setPosYEnemy(int posYEnemy) {
        this.posYEnemy = posYEnemy;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}