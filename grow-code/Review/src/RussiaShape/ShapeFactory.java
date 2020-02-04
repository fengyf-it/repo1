package RussiaShape;

/*
    图形工厂,用来生产方块
 */
public class ShapeFactory {
    public Shape getShape(ShapeListener listener){
        System.out.println("产生新图形");
        Shape shape = new Shape();
        shape.addShapeListener(listener);
        return shape;
    }
}
