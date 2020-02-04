package cn.itheima.thread.day01.practice;

/*
    2.定义一个官网线程类：NetShop，实现Runnable接口
		完成卖出水果的动作
 */
public class NetShop implements Runnable {
    Fruit fruit;

    public NetShop(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("2")){
            fruit.setStock(100);
            fruit.setCount(0);
        }
        while (fruit.getStock()>1) {
            synchronized (fruit) {
                if (fruit.getStock() % 2 == 0) {
                    try {
                        fruit.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                fruit.setCount(fruit.getCount()+1);
                System.out.println("实体店正在卖出第" + fruit.getCount() + "份,还剩余" + (fruit.getStock() -1) + "份");
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
