package cn.itheima.thread.day01.case04;

public class FrontShop implements Runnable {
    Fruit fruit;

    public FrontShop(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void run() {

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

