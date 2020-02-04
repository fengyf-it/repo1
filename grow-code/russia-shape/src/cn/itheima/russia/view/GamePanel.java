package cn.itheima.russia.view;



import cn.itheima.russia.entries.Ground;
import cn.itheima.russia.entries.Shape;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel{

    private Shape shape;
    private Ground ground;

    public GamePanel() {
        this.setSize(300,300);
    }

    public void display(Shape shape, Ground ground){
        System.out.println("GamePanel's display");
        this.ground = ground;
        this.shape = shape;
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
