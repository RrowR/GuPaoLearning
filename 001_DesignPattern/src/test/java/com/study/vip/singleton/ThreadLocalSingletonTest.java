package com.study.vip.singleton;

import com.study.singtonmode.hungry.lazy.DoubleCheckLazySingleton;
import com.study.singtonmode.threadlocal.ThreadLocalSingleton;

/**
 * @author: Rrow
 * @date: 2022/5/28 15:31
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
            ThreadLocalSingleton threadLocalSingleton2 = ThreadLocalSingleton.getInstance();
            System.out.println("111>>>" + threadLocalSingleton);
            System.out.println("222>>>" + threadLocalSingleton2);
        });

        Thread t2 = new Thread(() -> {
            ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
            ThreadLocalSingleton threadLocalSingleton2 = ThreadLocalSingleton.getInstance();
            System.out.println("111>>>" + threadLocalSingleton);
            System.out.println("222>>>" + threadLocalSingleton2);
        });

        t1.start();
        t2.start();

        System.out.println("end");
    }
}
