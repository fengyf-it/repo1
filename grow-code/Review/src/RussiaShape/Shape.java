package RussiaShape;

public class Shape {
    private ShapeListener listener;
    public Shape() {
        new Thread(new ShapeDriver()).start();
    }

    public void moveDown(){
        System.out.println("向下");
    }
    public void moveRight(){
        System.out.println("向右");
    }
    public void moveLeft(){
        System.out.println("向左");
    }
    public void moveRotate(){
        System.out.println("旋转");
    }
    public void drawMe(){
        System.out.println("我是一个方块");
    }

    /*
        定义一个内部类,实现自动下落的功能
        这个功能只在自身调用,所以私有化
     */
    private class ShapeDriver implements Runnable{
        @Override
        public void run() {
            while(true){
                try {
                    moveDown();
                    listener.shapeMoveDown(Shape.this);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void addShapeListener(ShapeListener l){
        if(listener ==null){
            listener = l;
        }
    }
}
