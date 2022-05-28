package com.study.vip.singleton;

import com.study.singtonmode.register.ContainerSingleton;

/**
 * @author: Rrow
 * @date: 2022/5/28 7:51
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance1 = ContainerSingleton.getInstance("com.study.vip.singleton.Entity");
        Object instance2 = ContainerSingleton.getInstance("com.study.vip.singleton.Entity");
        Object instance3 = ContainerSingleton.getInstance("com.study.vip.singleton.Domain");
        System.out.println(instance1 == instance2);
        System.out.println(instance3 == instance2);
    }
}
