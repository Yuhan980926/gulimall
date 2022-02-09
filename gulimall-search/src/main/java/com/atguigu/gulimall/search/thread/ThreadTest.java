package com.atguigu.gulimall.search.thread;

import java.util.concurrent.*;

/**
 * @program: gulimall
 * @description: 多线程测试类
 * @author: XinLi
 * @create: 2022-02-08 16:28
 **/
public class ThreadTest {
    public static ExecutorService executor = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("main............start");
//        CompletableFuture.runAsync(()->{
//            System.out.println("当前线程：" + Thread.currentThread().getName());
//            int i = 10/2;
//            System.out.println("运行结果" + i);
//        },executor);
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程：" + Thread.currentThread().getName());
            int i = 10 / 2;
            System.out.println("运行结果" + i);
            return i;
        }, executor).whenComplete((result,exception)->{
            System.out.println("异步任务完成了.....结果是"+result);
        });
        Integer integer = completableFuture.get();
        System.out.println("i = " + integer);
        System.out.println("main............end");
    }
}
