package com.study.springbootthreaddemo.block;

/**
 * @author: Rrow
 * @date: 2022/6/25 14:33
 */
public class ThreadInterruptDemo implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadInterruptDemo());
        thread.start();
        thread.interrupt();             // 默认是false,执行之后会变成true,执行while里的方法
    }

    private int i = 1;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {       // 执行interrupt方法之后,会从false边为true,执行手动地中断
            System.out.println("int value is " + i++);
        }
    }
}
