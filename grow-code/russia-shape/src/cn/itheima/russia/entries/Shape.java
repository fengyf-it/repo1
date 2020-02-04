package cn.itheima.russia.entries;

import cn.itheima.russia.listener.ShapeListener;

public class Shape {
    public Shape() {
        new Thread(new ShapeDriver()).start();
    }

    private ShapeListener listener;

    public void moveDown() {
        System.out.println("Shape's moveDown");
    }

    public void moveLeft() {
        System.out.println("Shape's moveLeft");
    }

    public void moveRight() {
        System.out.println("Shape's moveRight");
    }

    public void moveRotate() {
        System.out.println("Shape's moveRotate");
    }

    public void drawMe() {
        System.out.println("Shape's drawMe");
    }

    private class ShapeDriver implements Runnable {

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
        if (listener == null){
            listener = l;
        }
    }
}
