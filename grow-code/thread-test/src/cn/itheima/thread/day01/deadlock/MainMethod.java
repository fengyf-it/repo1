package cn.itheima.thread.day01.deadlock;

public class MainMethod {
    public static void main(String[] args) {
        ImplThread implThread = new ImplThread();

        Thread t1 = new Thread(implThread);
        Thread t2 = new Thread(implThread);
        t1.start();
        t2.start();
    }
}
