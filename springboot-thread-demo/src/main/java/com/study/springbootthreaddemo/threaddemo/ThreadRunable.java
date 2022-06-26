package com.study.springbootthreaddemo.threaddemo;

/**
 * @author: Rrow
 * @date: 2022/6/27 1:10
 */
public class ThreadRunable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new Thread(new ThreadRunable()).start();
    }
}
