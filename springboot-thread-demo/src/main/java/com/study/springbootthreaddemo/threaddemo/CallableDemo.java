package com.study.springbootthreaddemo.threaddemo;

import java.util.concurrent.*;

/**
 * @author: Rrow
 * @date: 2022/6/24 1:20
 */
// 实现Callable带返回值
public class CallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("来了老弟");
        return "success";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CallableDemo callableDemo = new CallableDemo();
        Future<String> future = executorService.submit(callableDemo);
        System.out.println(future.get());       // 带返回值的,是阻塞的
    }
}
