package cn.itheima.thread.day01.practice;

/*
一、根据需求实现代码
	1.定义一个Fruit水果类
		成员变量：stock库存
		构造方法、set和get
	2.定义一个官网线程类：NetShop，实现Runnable接口
		完成卖出水果的动作
	3.定义一个实体店线程类：FrontShop，实现Runnable接口
		完成卖出水果的动作
	4.使用等待唤醒机制完成卖出100份坚果的功能
		例如：
			官网正在卖出第1份，还剩余99份
			实体店正在卖出第2份，还剩余98份
			官网正在卖出第3份，还剩余97份
			实体店正在卖出第4份，还剩余96份
			...

 */
public class MainMethod {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();

        System.out.println(fruit.getStock());
        FrontShop frontShop = new FrontShop(fruit);
        NetShop netShop = new NetShop(fruit);

        Thread t1 = new Thread(frontShop,"1");
        Thread t2 = new Thread(netShop,"2");
        t1.start();
        t2.start();
        System.out.println("end..............");
    }
}
