package cn.itheima.thread.day01.deadlock;

public class LockB {
    private LockB() {
    }

    static final LockB lockB = new LockB();
}
