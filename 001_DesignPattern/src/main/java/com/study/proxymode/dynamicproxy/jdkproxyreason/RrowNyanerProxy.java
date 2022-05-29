package com.study.proxymode.dynamicproxy.jdkproxyreason;

import com.study.proxymode.dynamicproxy.jdkproxy.IPlay;

import java.lang.reflect.Method;

/**
 * @author: Rrow
 * @date: 2022/5/29 1:54
 */
public class RrowNyanerProxy implements RrowInvocationHandler {

    // jdk 代理这里需要目标对象,根本不需要接口，接口在下面方法中进行获取
    private RrowIPlay target;

    public RrowIPlay getInstance(RrowIPlay obj){
        this.target = obj;
        Class<?> clazz = obj.getClass();
        // 返回创建一个代理对象，获取传入对象实现的接口，以及Nyaner本身的InvocationHandler
        return ((RrowIPlay) RrowProxy.newProxyInstance(new RrowClassLoader(), clazz.getInterfaces(), this));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("开始找人");
    }

    private void before() {
        System.out.println("游玩结束");
    }


}
