package com.study.springbootthreaddemo;

/**
 * @Author: Rrow
 * @Date: 2022/6/27 09:47
 */
public class ThreadWorker implements Runnable{
    @Override
    public void run() {
        System.out.println("哈哈哈");
    }
}
