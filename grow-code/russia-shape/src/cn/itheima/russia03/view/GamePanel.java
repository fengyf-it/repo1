package cn.itheima.russia03.view;

import cn.itheima.russia03.entries.Ground;
import cn.itheima.russia03.entries.Shape;

import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {

    private Shape shape;
    private Ground ground;

    public void display(Shape shape, Ground ground){
        System.out.println("GamePanel's display");
        this.repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        if(shape!=null&&ground!=null){
            shape.drawMe();
            ground.drawMe();
        }
    }
}
