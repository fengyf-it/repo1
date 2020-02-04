package cn.itheima.thread.day01.ThreadPool;

import java.util.concurrent.Callable;

public class GetSumCallable implements Callable<Integer> {
    private int anInt ;

    public GetSumCallable(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public Integer call(){
        int sum=0;
        for(int i = 1 ;i<=anInt;i++){
            sum+=i;
        }
        return sum;
    }
}
