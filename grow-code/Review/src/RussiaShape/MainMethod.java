package RussiaShape;

import javax.swing.*;

public class MainMethod {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Ground ground = new Ground();
        GamePanel gamePanel = new GamePanel();

        Controller controller = new Controller(shapeFactory,ground,gamePanel);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(gamePanel.getSize().width+10,gamePanel.getSize().height+30);
        frame.add(gamePanel);
        frame.setVisible(true);
        controller.newGame();

    }
}
