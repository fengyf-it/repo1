package cn.itheima.thread.day01.deadlock;



public class LockA {
    private LockA(){}

    static final LockA lockA = new LockA();
}
