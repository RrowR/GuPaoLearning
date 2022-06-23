package com.study.springbootthreaddemo.threaddemo;

/**
 * @author: Rrow
 * @date: 2022/6/24 1:21
 */

// 继承Thread类
public class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("继承的方法执行了...");
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        t1.start();
    }

}
