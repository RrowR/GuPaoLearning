package com.study.springbootthreaddemo.block;

import java.util.concurrent.TimeUnit;

/**
 * @author: Rrow
 * @date: 2022/6/25 14:33
 */
public class ThreadInterruptDemo2 implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadInterruptDemo2());
        thread.start();
        Thread.sleep(1);     // 让main线程睡一会,只需要睡一小会就好了,然后调用中断的方法,程序就会执行中断方法,连proccsor End都不会打印整个Run方法都会失效
        thread.interrupt();
        // Thread.interrupted();               // 复位的另一种方法   变为 true ,不过这里操作的是主线程
    }


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                TimeUnit.SECONDS.sleep(200);
            } catch (InterruptedException e) {          // 这里中断之后,程序不会停下,这里触发了线程的复位     false -> true -> false
                e.printStackTrace();
                // 这里还需要做处理,再次中断,从false变为true,不再执行下次循环
                Thread.currentThread().interrupt();     // 再次中断,可以执行后续方法   false --> true
            }
        }
        System.out.println("proccsor End");
    }
}
