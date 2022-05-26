package com.study.vip.singleton;

import com.study.singtonmode.hungry.lazystaticinnersingleton.LazyStaticInnerClassSingleton;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * @author: Rrow
 * @date: 2022/5/27 0:13
 */
public class DestroyLazyStaticInnerClassSingletonByReflect {

    /*
     * 反射能够破坏单例
     * */
    @Test
    public void DestryByReflect() {
        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            // 获取无参构造
            Constructor constructor = clazz.getDeclaredConstructor(null);
            // 开启权限
            constructor.setAccessible(true);
            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();
            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
