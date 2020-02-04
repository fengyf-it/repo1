package cn.itheima.russia.entries;

import cn.itheima.russia.listener.ShapeListener;

public class ShapeFactory {

    public Shape getShape(ShapeListener listener) {
        System.out.println("ShapeFactory's getShape");
        Shape shape = new Shape();
        shape.addShapeListener(listener);
        return shape;
    }
}
