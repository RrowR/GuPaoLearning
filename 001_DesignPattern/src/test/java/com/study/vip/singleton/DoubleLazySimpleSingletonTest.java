package com.study.vip.singleton;

import com.study.singtonmode.hungry.lazy.DoubleCheckLazySingleton;
import com.study.singtonmode.hungry.lazy.LazySimpleSingletion;

/**
 * @author: Rrow
 * @date: 2022/5/25 23:29
 */
public class DoubleLazySimpleSingletonTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            DoubleCheckLazySingleton doubleCheckLazySingleton = DoubleCheckLazySingleton.getInstance();
            System.out.println(doubleCheckLazySingleton);
        });

        Thread t2 = new Thread(() -> {
            DoubleCheckLazySingleton doubleCheckLazySingleton = DoubleCheckLazySingleton.getInstance();
            System.out.println(doubleCheckLazySingleton);
        });

        t1.start();
        t2.start();

        System.out.println("end");
    }
}
