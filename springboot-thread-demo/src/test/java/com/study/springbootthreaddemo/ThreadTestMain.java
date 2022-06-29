package com.study.springbootthreaddemo;

/**
 * @author: Rrow
 * @date: 2022/6/29 23:22
 */
public class ThreadTestMain {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 10;
        }
    };

    public static void main(String[] args) {
        new Thread(() -> {
            threadLocal.set(threadLocal.get() + 5);
            System.out.println("1threadLocal.get() = " + threadLocal.get());
        },"t1").start();

        // new Thread(() -> {
        //     threadLocal.set(threadLocal.get() + 10);
        //     System.out.println("2threadLocal.get() = " + threadLocal.get());
        // }).start();
    }
}
