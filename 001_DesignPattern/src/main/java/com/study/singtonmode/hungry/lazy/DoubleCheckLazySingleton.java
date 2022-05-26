package com.study.singtonmode.hungry.lazy;

/**
 * @Author: Rrow
 * @Date: 2022/5/26 12:31
 */
public class DoubleCheckLazySingleton {

    private static volatile DoubleCheckLazySingleton doubleCheckLazySingleton;

    // 构造方法私有化
    private DoubleCheckLazySingleton() {
    }

    // 方法里加锁
    public static DoubleCheckLazySingleton getInstance() {
        if (doubleCheckLazySingleton == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (doubleCheckLazySingleton == null) {
                    doubleCheckLazySingleton = new DoubleCheckLazySingleton();
                    // 存在指令从排序的问题
                }
            }
        }
        return doubleCheckLazySingleton;
    }

}
