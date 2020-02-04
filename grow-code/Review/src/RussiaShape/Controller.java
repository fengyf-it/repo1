package RussiaShape;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller extends KeyAdapter implements ShapeListener{
    private Shape shape;
    private ShapeFactory shapeFactory;
    private Ground ground;
    private GamePanel gamePanel;

    public Controller(ShapeFactory shapeFactory, Ground ground, GamePanel gamePanel) {
        this.shapeFactory = shapeFactory;
        this.ground = ground;
        this.gamePanel = gamePanel;
    }
    public void newGame(){
        shape = shapeFactory.getShape(this);
    }

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
        }
        gamePanel.display(shape,ground);
    }

    @Override
    public void shapeMoveDown(Shape shape) {
        gamePanel.display(shape,ground);
    }
}
