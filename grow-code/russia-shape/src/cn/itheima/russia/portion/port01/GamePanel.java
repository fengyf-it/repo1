package cn.itheima.russia.portion.port01;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Shape shape;

    public GamePanel() {
        this.setSize(500,500);
    }

    public void display(Shape shape){
        System.out.println("GamePanel 画画");
        this.shape=shape;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(shape!=null){
            shape.drawMe();
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
        }
    }
}
