package com.poli.edu.aircombat.components;

import javax.swing.*;
import java.awt.*;

public class PaintGif {

    private ImageIcon image;
    public static String RESIZING_BY_WIDTH = "width";
    public static String RESIZING_BY_HEIGHT = "height";

    public PaintGif(String path) {
        image = new ImageIcon(getClass().getResource(path));
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public void resizeBySize(int width, int height){
        image.setImage(image.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }

    public void resizeByPercentage(double percentage) {
        int widthResize = (int) Math.round(image.getIconWidth()-(image.getIconWidth()*percentage));
        int heightResize = (int) Math.round(image.getIconHeight()-(image.getIconHeight()*percentage));

        this.resizeBySize(widthResize, heightResize);
    }

    public void resizeByScreenPercentage(Dimension screenSize, double percentage, String typeOfResizing) {

        double percentageOfResizing =  0.0;

        if(typeOfResizing.equals(RESIZING_BY_WIDTH)) {
            percentageOfResizing = (image.getIconWidth()-(screenSize.width*percentage))/image.getIconWidth();
        } else if (typeOfResizing.equals(RESIZING_BY_HEIGHT)) {
            percentageOfResizing = (image.getIconHeight()-(screenSize.height*percentage))/image.getIconHeight();
        } else {
            return;
        }

        int widthResize = (int) Math.round(image.getIconWidth()-(image.getIconWidth()*percentageOfResizing));
        int heightResize = (int) Math.round(image.getIconHeight()-(image.getIconHeight()*percentageOfResizing));

        this.resizeBySize(widthResize, heightResize);
    }
}