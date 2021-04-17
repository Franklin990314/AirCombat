/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.edu.aircombat;

import com.poli.edu.aircombat.components.EnemyFire;
import com.poli.edu.aircombat.components.PaintGif;
import com.poli.edu.aircombat.threads.EnemyThread;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.*;

/**
 *
 * @author nicolas.herran
 */
public class Main extends javax.swing.JFrame {

    private Dimension screenSize;
    private ImageIcon airplaneImage;
    private Vector<EnemyFire> EnemyFires = new Vector<>();
    
    public Main() {
        this.setTitle("Air Combat");
        initComponents();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        initComponentsManually();
        initView();

        EnemyThread enemyThread = new EnemyThread(this, mainPanel, 100);
        enemyThread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JLayeredPane();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(800, 600));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setMaximumSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        mainPanel.setName(""); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        mainPanel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgrouds/3376462.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.VK_W == evt.getKeyCode()) {
            if (!(airplane.getY() < (0))) {
                airplane.setLocation(airplane.getX(), airplane.getY() - 5);
            }
        }
        if (evt.VK_S == evt.getKeyCode()) {
            if (!(airplane.getY() > (screenSize.height - airplaneImage.getIconHeight() - 30))) {
                airplane.setLocation(airplane.getX(), airplane.getY() + 5);
            }
        }
        if (evt.VK_UP == evt.getKeyCode()) {
            if (!(airplane.getY() < (0))) {
                airplane.setLocation(airplane.getX(), airplane.getY() - 5);
            }
        }
        if (evt.VK_DOWN == evt.getKeyCode()) {
            if (!(airplane.getY() > (screenSize.height - airplaneImage.getIconHeight() - 30))) {
                airplane.setLocation(airplane.getX(), airplane.getY() + 5);
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.VK_W == evt.getKeyCode()) {
            if (!(airplane.getY() < (0))) {
                airplane.setLocation(airplane.getX(), airplane.getY() - 5);
            }
        }
        if (evt.VK_S == evt.getKeyCode()) {
            if (!(airplane.getY() > (screenSize.height - airplaneImage.getIconHeight() - 30))) {
                airplane.setLocation(airplane.getX(), airplane.getY() + 5);
            }
        }
        if (evt.VK_UP == evt.getKeyCode()) {
            if (!(airplane.getY() < (0))) {
                airplane.setLocation(airplane.getX(), airplane.getY() - 5);
            }
        }
        if (evt.VK_DOWN == evt.getKeyCode()) {
            if (!(airplane.getY() > (screenSize.height - airplaneImage.getIconHeight() - 30))) {
                airplane.setLocation(airplane.getX(), airplane.getY() + 5);
            }
        }
    }//GEN-LAST:event_formKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLayeredPane mainPanel;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel airplane;

    private void initView(){
        System.out.println("Tu resolución es de " + screenSize.width + "x" + screenSize.height);
        this.getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, screenSize.width, screenSize.height));
        this.setBounds(0,50,screenSize.width, screenSize.height);
        this.setResizable(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    private void initComponentsManually() {

        airplane = new javax.swing.JLabel();
        PaintGif airplanePaint = new PaintGif("/img/airplane/airplane_01.gif");
        airplanePaint.resizeByScreenPercentage(screenSize, 0.15, PaintGif.RESIZING_BY_HEIGHT);

        airplaneImage = airplanePaint.getImage();

        airplane.setIcon(airplaneImage); // NOI18N
        int x = (int) Math.round(screenSize.width*0.02);
        int y = (int) Math.round(screenSize.height/2 - airplaneImage.getIconHeight()/2);
        System.out.println("Las dimensiones del avión son de " + airplaneImage.getIconWidth() + "x" + airplaneImage.getIconHeight());
        airplane.setBounds(x, y, airplaneImage.getIconWidth(), airplaneImage.getIconHeight());
        mainPanel.add(airplane);
    }

    public Dimension getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Dimension screenSize) {
        this.screenSize = screenSize;
    }

    public ImageIcon getAirplaneImage() {
        return airplaneImage;
    }

    public void setAirplaneImage(ImageIcon airplaneImage) {
        this.airplaneImage = airplaneImage;
    }

    public Vector<EnemyFire> getEnemyFires() {
        return EnemyFires;
    }

    public void setEnemyFires(Vector<EnemyFire> enemyFires) {
        EnemyFires = enemyFires;
    }

    public void addEnemyFires(EnemyFire enemyFires) {
        this.EnemyFires.add(enemyFires);
    }
}
