package cn.itheima.russia02.entities;

import cn.itheima.russia02.listener.ShapeListener;

public class ShapeFactory {

    public Shape getShape(ShapeListener listener){
        System.out.println("生成了一个方块");
        Shape shape = new Shape();
        shape.addShapeListener(listener);
        return shape;
    }

}
