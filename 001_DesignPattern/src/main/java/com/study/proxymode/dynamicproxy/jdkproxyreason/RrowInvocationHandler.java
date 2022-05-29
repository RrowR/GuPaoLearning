package com.study.proxymode.dynamicproxy.jdkproxyreason;

import java.lang.reflect.Method;

public interface RrowInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable;
}