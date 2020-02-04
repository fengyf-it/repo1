package cn.itheima.thread.day01.ThreadPool;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
    使用多线程技术求和
    两个线程,1个计算1+...+100,另一个计算1+...+200
    涉及到的知识:多线程的异步计算
 */
public class ThreadPoolDemo01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> submit = es.submit(new GetSumCallable(100));
        Future<Integer> submit1 = es.submit(new GetSumCallable(200));

        System.out.println(submit.get());
        System.out.println(submit1.get());
    }
}
