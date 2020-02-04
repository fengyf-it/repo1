package cn.itheima.russia03.entries;

/*
    方块类
        有移动的方法
        有绘制自身的方法
        自动下落,从方块产生开始
 */
public class Shape {
    public void moveDown(){
        System.out.println("Shape's moveDown");
    }
    public void moveLeft(){
        System.out.println("Shape's moveLeft");
    }
    public void moveRight(){
        System.out.println("Shape's moveRight");
    }
    public void moveRotate(){
        System.out.println("Shape's moveRotate");
    }
    public void drawMe(){
        System.out.println("Shape's drawMe");
    }

    private class ShapeDriver implements Runnable{
        @Override
        public void run() {
            while(true){
                moveDown();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
