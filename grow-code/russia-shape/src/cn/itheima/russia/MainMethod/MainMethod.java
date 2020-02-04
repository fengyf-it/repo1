package cn.itheima.russia.MainMethod;

import cn.itheima.russia.controller.Controller;
import cn.itheima.russia.entries.Ground;
import cn.itheima.russia.entries.ShapeFactory;
import cn.itheima.russia.view.GamePanel;

import javax.swing.*;
import java.io.FileReader;

public class MainMethod {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Ground ground = new Ground();
        GamePanel gamePanel = new GamePanel();

        Controller controller = new Controller(ground, shapeFactory,gamePanel);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(gamePanel.getSize().width+10,gamePanel.getSize().height+35);
        frame.add(gamePanel);
        gamePanel.addKeyListener(controller);
        frame.setVisible(true);
        controller.newGame();
    }
}
