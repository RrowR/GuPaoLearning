package com.study.springbootthreadvolatile;

/**
 * @author: Rrow
 * @date: 2022/6/25 18:57
 */
public class VolatileDemo3 {

    public static boolean stop = false;

    // 打印在外面也可以结束
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (!stop) {
                i++;
                System.out.println("i vaule = " + i);           // 活性失败
            }
        });
        thread.start();
        Thread.sleep(1000);
        stop = true;
    }


}
