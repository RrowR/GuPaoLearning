package com.study.singtonmode.hungry.lazy;

/**
 * @author: Rrow
 * @date: 2022/5/25 23:26
 */
public class LazySimpleSingletion {
    private static LazySimpleSingletion lazySimpleSingletion;

    // 构造方法私有化
    private LazySimpleSingletion() {
    }

    // 有多线程安全问题
    public synchronized static LazySimpleSingletion getInstance(){
        if (lazySimpleSingletion == null){
            lazySimpleSingletion = new LazySimpleSingletion();
        }
        return lazySimpleSingletion;
    }
}
