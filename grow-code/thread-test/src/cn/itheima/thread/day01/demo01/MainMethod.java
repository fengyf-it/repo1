package cn.itheima.thread.day01.demo01;

public class MainMethod {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        for(int i=0;i<50;i++){
            System.out.println("main:"+i);
        }
    }
}
