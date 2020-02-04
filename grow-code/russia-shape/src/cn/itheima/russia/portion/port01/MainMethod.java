package cn.itheima.russia.portion.port01;

import javax.swing.*;

public class MainMethod {
    public static void main(String[] args) {
        GamePanel gamePanel = new GamePanel();
        Shape shape = new Shape();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(gamePanel.getSize().width+10,gamePanel.getHeight()+30);
        frame.add(gamePanel);
        gamePanel.display(shape);
        frame.setVisible(true);

    }
}
