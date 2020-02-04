package cn.itheima.thread.day01.ticketcase;

public class Tickets implements Runnable {
    private Object obj = new Object();

    private int tickets = 1000;

    @Override
    public void run() {
        while (true) {
            payTicket();
        }
    }

    public synchronized void payTicket() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "出售第:" + tickets--);
        }
    }
}
