package cn.itheima.thread.day01.ThreadPool;

public class ImplRunnable  implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
