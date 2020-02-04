package cn.itheima.russia.portion.port02;

public class Shape {

    public Shape() {
        new Thread(new ShapeDriver()).start();
    }

    private class ShapeDriver implements Runnable{

        @Override
        public void run() {
            while (true){
                System.out.println("下落");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
