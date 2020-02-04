package cn.itheima.russia03.controller;

import cn.itheima.russia03.entries.Ground;
import cn.itheima.russia03.entries.Shape;
import cn.itheima.russia03.entries.ShapeFactory;
import cn.itheima.russia03.view.GamePanel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller extends KeyAdapter {
    private Shape shape;
    private Ground ground;
    private GamePanel gamePanel;
    private ShapeFactory shapeFactory;

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                shape.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                shape.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                shape.moveRight();
                break;
            case KeyEvent.VK_UP:
                shape.moveRotate();
                break;
            default:
                System.out.println("有误");
        }
        gamePanel.display(shape,ground);
    }


}
