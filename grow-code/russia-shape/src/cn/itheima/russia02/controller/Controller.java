package cn.itheima.russia02.controller;

import cn.itheima.russia02.entities.Ground;
import cn.itheima.russia02.entities.Shape;
import cn.itheima.russia02.entities.ShapeFactory;
import cn.itheima.russia02.listener.ShapeListener;
import cn.itheima.russia02.view.GamePanel;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller extends KeyAdapter implements ShapeListener {

    private Shape shape;
    private Ground ground;
    private ShapeFactory shapeFactory;
    private GamePanel gamePanel;

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                shape.moveRotate();
                System.out.println("旋转");
                break;
            case KeyEvent.VK_DOWN:
                shape.moveDown();
                System.out.println("向下");
                break;
            case KeyEvent.VK_LEFT:
                shape.moveLeft();
                System.out.println("左走");
                break;
            case KeyEvent.VK_RIGHT:
                shape.moveRight();
                System.out.println("右走");
                break;
            default:
                System.out.println("有误");
        }
        gamePanel.display(shape, ground);
    }


    @Override
    public void shapeMoveDown(Shape shape) {
        gamePanel.display(shape, ground);
    }

    public void newGame(){
        shape = shapeFactory.getShape(this);
    }
}
