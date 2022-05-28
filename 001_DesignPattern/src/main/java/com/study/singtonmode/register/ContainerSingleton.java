package com.study.singtonmode.register;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Rrow
 * @date: 2022/5/28 7:40
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap();

    public static Object getInstance(String className) {
        Object instance = null;
        // 这里会存在线程安全的问题，同时都为空，那么后一个线程会把前一个线程的instance进行覆盖
        if (concurrentHashMap.get(className) == null) {
            try {
                instance = Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            concurrentHashMap.put(className, instance);
            return instance;
        } else {
            return concurrentHashMap.get(className);
        }
    }

}
