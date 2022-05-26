package com.study.vip.singleton;

import com.study.singtonmode.hungry.lazy.DoubleCheckLazySingleton;
import com.study.singtonmode.hungry.lazy.DoubleCheckLazySingleton;

/**
 * @author: Rrow
 * @date: 2022/5/25 23:29
 */
public class DoubleCheckSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            DoubleCheckLazySingleton doublechecklazysingleton = DoubleCheckLazySingleton.getInstance();
            System.out.println(doublechecklazysingleton);
        });

        Thread t2 = new Thread(() -> {
            DoubleCheckLazySingleton doublechecklazysingleton = DoubleCheckLazySingleton.getInstance();
            System.out.println(doublechecklazysingleton);
        });

        t1.start();
        t2.start();

        System.out.println("end");

    }
}
