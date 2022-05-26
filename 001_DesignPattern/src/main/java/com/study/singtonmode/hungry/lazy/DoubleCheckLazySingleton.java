package com.study.singtonmode.hungry.lazy;

/**
 * @author: Rrow
 * @date: 2022/5/26 23:00
 */
public class DoubleCheckLazySingleton {

    // 这里需要volatile关键字，避免指令重排
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
