package com.study.proxymode.dynamicproxy.jdkproxy;

/**
 * @author: Rrow
 * @date: 2022/5/29 2:24
 */
public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        NyanerProxy proxy = new NyanerProxy();
        // 传入目标对象，返回一个代理对象
        IPlay neko = proxy.getInstance(new Nekoha());
        // 代理对象来调用方法
        neko.play();

        // 这里无法调用Ieat接口里的eat方法
        IPlay shuzuku = proxy.getInstance(new Shuzuku());
        // 代理对象来调用方法
        shuzuku.play();
    }
}
