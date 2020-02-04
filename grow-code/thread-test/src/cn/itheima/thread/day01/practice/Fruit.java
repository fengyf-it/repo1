package cn.itheima.thread.day01.practice;

/*
1.定义一个Fruit水果类
		成员变量：stock库存
		构造方法、set和get
 */
public class Fruit {
    private int stock;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
