package com.study.vip.singleton;

import com.study.singtonmode.register.EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: Rrow
 * @date: 2022/5/27 1:50
 */
public class EnumReflect {
    public static void main(String[] args) {
        // EnumSingleton instance = EnumSingleton.getInstance();
        // instance.setData(new Object());
        // System.out.println(instance.getData());
        Class<?> clazz = EnumSingleton.class;
        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
            System.out.println(constructor);
            constructor.setAccessible(true);
            /*
                枚举不支持反射创建对象
                java.lang.IllegalArgumentException: Cannot reflectively create enum objects
                源码：类的修饰符不能是枚举，否则就抛异常
                if ((clazz.getModifiers() & Modifier.ENUM) != 0)
                throw new IllegalArgumentException("Cannot reflectively create enum objects");
             */
            constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
