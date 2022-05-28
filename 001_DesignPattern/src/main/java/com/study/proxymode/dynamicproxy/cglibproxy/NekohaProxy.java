package com.study.proxymode.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: Rrow
 * @date: 2022/5/29 3:32
 */
public class NekohaProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        // cglib的类库
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        // 这里调用的是Super方法
        Object res = methodProxy.invokeSuper(o, objects);
        after();
        return res;
    }

    private void after() {
        System.out.println("开始找人");
    }

    private void before() {
        System.out.println("游玩结束");
    }
}
