package com.study.singtonmode.hungry.lazystaticinnersingleton;

/**
 * @author: Rrow
 * @date: 2022/5/26 23:42
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        if (LazyStaticInnerClassSingleton.getInstance() != null){
            throw new RuntimeException("不允许反射我....");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
