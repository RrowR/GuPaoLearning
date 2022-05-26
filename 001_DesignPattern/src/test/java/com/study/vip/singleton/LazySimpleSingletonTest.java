package com.study.vip.singleton;

import com.study.singtonmode.hungry.lazy.LazySimpleSingletion;

/**
 * @author: Rrow
 * @date: 2022/5/25 23:29
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            LazySimpleSingletion lazySimpleSingletion = LazySimpleSingletion.getInstance();
            System.out.println(lazySimpleSingletion);
        });

        Thread t2 = new Thread(() -> {
            LazySimpleSingletion lazySimpleSingletion = LazySimpleSingletion.getInstance();
            System.out.println(lazySimpleSingletion);
        });

        t1.start();
        t2.start();

        System.out.println("end");

    }
}
