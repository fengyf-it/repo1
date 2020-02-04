package cn.itheima.russia02.view;

import cn.itheima.russia02.entities.Ground;
import cn.itheima.russia02.entities.Shape;

import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel {
    private Shape shape;
    private Ground ground;
    public void display(Shape shape,Ground ground){
        this.shape = shape;
        this.ground = ground;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(shape!= null&&ground!=null){
            shape.drawMe();
            ground.drawMe();
        }
    }

    public GamePanel() {
        this.setSize(300,300);
    }
}
