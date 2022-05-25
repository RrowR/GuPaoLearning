package com.study.singtonmode.hungry;

/**
 * @author: Rrow
 * @date: 2022/5/25 22:40
 */
public class HungrySingleton {

    /*
     *   饿汉式：
     *       出现内存浪费的情况
     * */

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

}
