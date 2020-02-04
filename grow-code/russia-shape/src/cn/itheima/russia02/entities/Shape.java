package cn.itheima.russia02.entities;

import cn.itheima.russia02.listener.ShapeListener;

public class Shape {

    private ShapeListener listener;

    public void moveDown() {
        System.out.println("Shape's Down");
    }

    public void moveRight() {
        System.out.println("Shape's Right");
    }

    public void moveLeft() {
        System.out.println("Shape's Left");
    }

    public void moveRotate() {
        System.out.println("Shape's Rotate");
    }

    public void drawMe() {
        System.out.println("Shape's drawMe");
    }

    public class ShapeDriver implements Runnable {
        @Override
        public void run() {
            while (true) {
                moveDown();
                listener.shapeMoveDown(Shape.this);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void addShapeListener(ShapeListener l) {
        if (listener != null) {
            listener = l;
        }
    }
}
