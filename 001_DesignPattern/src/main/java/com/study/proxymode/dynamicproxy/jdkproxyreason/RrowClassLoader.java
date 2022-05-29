package com.study.proxymode.dynamicproxy.jdkproxyreason;

/**
 * @author: Rrow
 * @date: 2022/5/29 4:34
 */
public class RrowClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return null;
    }
}
