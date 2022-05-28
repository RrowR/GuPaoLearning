package com.study.singtonmode.hungry.seriable;

import java.io.Serializable;

/**
 * @author: Rrow
 * @date: 2022/5/28 14:01
 */
public class SeriableSingleton implements Serializable {

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    // 桥接模式
    private Object readResolve(){
        return INSTANCE;
    }
}
