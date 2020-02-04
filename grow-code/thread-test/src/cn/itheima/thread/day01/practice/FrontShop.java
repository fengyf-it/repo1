package cn.itheima.thread.day01.practice;

public class FrontShop implements Runnable {
    Fruit fruit;

    public FrontShop(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("1")){
            fruit.setStock(100);
            fruit.setCount(0);
        }
        while (fruit.getStock()>1) {
            synchronized (fruit) {
                if (fruit.getStock() % 2 == 1) {
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                fruit.setCount(fruit.getCount()+1);
                System.out.println("官网正在卖出第" + fruit.getCount() + "份,还剩余" + (fruit.getStock()-1) + "份");
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                fruit.setStock(fruit.getStock() - 1);
                fruit.notify();
            }
        }
    }
}
