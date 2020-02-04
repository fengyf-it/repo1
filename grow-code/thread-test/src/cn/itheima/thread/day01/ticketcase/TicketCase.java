package cn.itheima.thread.day01.ticketcase;

public class TicketCase {
    public static void main(String[] args) {
        Tickets ticket = new Tickets();

        Thread t1 = new Thread(ticket,"1号窗口");
        Thread t2 = new Thread(ticket,"2号窗口");
        Thread t3 = new Thread(ticket,"3号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
