package cn.itheima.russia.portion.port03;

public class Shape {
    private ShapeListener listener;

    public Shape() {
        new Thread(new ShapeDriver()).start();
    }

    public void drawMe(){
        System.out.println("画方块");
    }
    public void move() {
        System.out.println("下落");

    }

    private class ShapeDriver implements Runnable {
        @Override
        public void run() {
            while (true) {
                move();
                listener.shapeMoveDown(Shape.this); // 下落的时候触发这个监听事件
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                drawMe();
            }
        }
    }

    //既然有调用,就需要有注册监听器的方法,这个注册需要在生成方块的时候就需要有
    public void addListener(ShapeListener l){
        if(listener == null){
            listener = l;
        }
    }
}
