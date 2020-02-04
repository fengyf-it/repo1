package RussiaShape;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Shape shape;
    private Ground ground;

    public GamePanel() {
        this.setSize(500,300);
    }

    public void display(Shape shape, Ground ground){
        System.out.println("画图");
        this.ground=ground;
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
