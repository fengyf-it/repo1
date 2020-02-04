package russiashape02;

public class Shape {
    public Shape() {
        new Thread(new ShapeDriver()).start();
    }

    public void move(){
        System.out.println("移动,上下左右");
    }
    public void drawMe(){
        System.out.println("绘制自身");
    }

    private class ShapeDriver implements Runnable{
        @Override
        public void run() {
            while (true){
                move();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                drawMe();
            }
        }
    }
}
