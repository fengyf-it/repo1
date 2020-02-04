package cn.itheima.thread.day01.deadlock;

public class ImplThread implements Runnable {
    private int num = 0;

    @Override
    public void run() {
        while (true) {
            if (num % 2 == 0) {
                synchronized (LockA.lockA) {
                    System.out.println(Thread.currentThread().getName() + ":lockA");
                    synchronized (LockB.lockB) {
                        System.out.println(Thread.currentThread().getName() + ":lockB");
                    }
                }
            } else {
                synchronized (LockB.lockB) {
                    System.out.println(Thread.currentThread().getName() + ":lockB");
                    synchronized (LockA.lockA) {
                        System.out.println(Thread.currentThread().getName() + ":lockA");
                    }
                }
            }
            num++;
        }

    }
}
