package cn.itheima.demo01;

/*
    使用lambda
 */
public class Demo01 {

    public static void startThread(Runnable run){
        new Thread(run).start();
    }
    public static void main(String[] args) {
        //正常写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"...开启");
            }
        }).start();
        // 使用lambda,函数式编程思想
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"...开启");
        }).start();
        //使用方法
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"...开启");
            }
        });
        //使用方法,lambda
        startThread(() -> System.out.println(Thread.currentThread().getName()+"...开启"));

    }
}
