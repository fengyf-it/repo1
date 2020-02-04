package cn.itheima.russia.controller;

import cn.itheima.russia.entries.Ground;
import cn.itheima.russia.entries.Shape;
import cn.itheima.russia.entries.ShapeFactory;
import cn.itheima.russia.listener.ShapeListener;
import cn.itheima.russia.view.GamePanel;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller extends KeyAdapter implements ShapeListener {
    private Shape shape;
    private Ground ground;
    private ShapeFactory shapeFactory;
    private GamePanel gamePanel;

    public Controller( Ground ground, ShapeFactory shapeFactory, GamePanel gamePanel) {
        this.ground = ground;
        this.shapeFactory = shapeFactory;
        this.gamePanel = gamePanel;
    }

    public void newGame(){
        shape = shapeFactory.getShape(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                shape.moveRotate();
                break;
            case KeyEvent.VK_DOWN:
                shape.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                shape.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                shape.moveRight();
                break;
            default:
                System.out.println("有误");
                break;
        }
        gamePanel.display(shape, ground);
    }

    @Override
    public void shapeMoveDown(Shape shape) {
        gamePanel.display(shape, ground);
    }
}
