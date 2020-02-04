package cn.itheima.russia.portion.port03;

public class ShapeFactory {
    public Shape getShape(ShapeListener listener){
        System.out.println("图形工厂生产图形成功");
        Shape shape = new Shape();
        shape.addListener(listener);
        return shape;
    }
}
