package com.study.springbootthreadvolatile;

/**
 * @author: Rrow
 * @date: 2022/6/25 18:57
 */
public class VolatileDemo4 {

    public static boolean stop = false;

    // 线程内睡眠也是可以的
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (!stop) {
                i++;
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        Thread.sleep(1000);
        stop = true;
    }


}
