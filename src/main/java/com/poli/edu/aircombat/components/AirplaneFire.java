package com.poli.edu.aircombat.components;

import javax.swing.*;
import java.awt.*;

public class AirplaneFire extends JLabel {

    private int posYAirplane;
    private int posXAirplane;
    private boolean isDelete;

    public AirplaneFire(ImageIcon imageIcon, Dimension screenSize, int posX, int posY){
        try {
            this.posXAirplane = posX;
            this.posYAirplane = posY;
            this.setIcon(imageIcon);
            this.setBounds(posXAirplane, posYAirplane, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        } catch (Exception exc){
            System.out.println(exc.getMessage());
        }
    }

    public int getPosYAirplane() {
        return posYAirplane;
    }

    public void setPosYAirplane(int posYAirplane) {
        this.posYAirplane = posYAirplane;
    }

    public int getPosXAirplane() {
        return posXAirplane;
    }

    public void setPosXAirplane(int posXAirplane) {
        this.posXAirplane = posXAirplane;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
