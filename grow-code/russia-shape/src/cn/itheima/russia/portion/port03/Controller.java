package cn.itheima.russia.portion.port03;

public class Controller implements ShapeListener{

    public Controller(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    private Shape shape;
    private ShapeFactory shapeFactory;
    @Override
    public void shapeMoveDown(Shape shape) {
        shape.move();
    }
    public void newGame(){
        shape = shapeFactory.getShape(this);
    }
}
