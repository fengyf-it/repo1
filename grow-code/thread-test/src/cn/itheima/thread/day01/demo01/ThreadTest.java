package cn.itheima.thread.day01.demo01;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.println("thread:"+i);
        }
    }
}
