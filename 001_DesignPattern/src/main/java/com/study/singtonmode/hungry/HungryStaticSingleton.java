package com.study.singtonmode.hungry;

/**
 * @author: Rrow
 * @date: 2022/5/25 23:09
 */
public class HungryStaticSingleton {

    private static HungryStaticSingleton hungryStaticSingleton;

    private HungryStaticSingleton() {
    }

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }

}
