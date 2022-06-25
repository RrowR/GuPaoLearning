package com.study.springbootthreaddemo.block;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author: Rrow
 * @date: 2022/6/25 13:41
 */

// 线程的3种阻塞方式
public class ThreadBlockDemo {
    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(100);        // TIMED_WAITING
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "STATUS_01").start();  //阻塞状态

        new Thread(() -> {
            while (true) {
                synchronized (ThreadBlockDemo.class) {
                    try {
                        ThreadBlockDemo.class.wait();           // WAITING
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "STATUS_02").start(); //阻塞状态
        new Thread(new BlockedDemo(), "BLOCKED-DEMO-01").start();           // TIMED_WAITING
        new Thread(new BlockedDemo(), "BLOCKED-DEMO-02").start();           // BLOCKED
    }


    static class BlockedDemo extends Thread {
        @Override
        public void run() {
            synchronized (BlockedDemo.class) {
                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
