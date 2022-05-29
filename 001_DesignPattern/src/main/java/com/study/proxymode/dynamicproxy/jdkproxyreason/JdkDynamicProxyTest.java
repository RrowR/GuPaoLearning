package com.study.proxymode.dynamicproxy.jdkproxyreason;

/**
 * @author: Rrow
 * @date: 2022/5/29 2:24
 */
public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        RrowNyanerProxy proxy = new RrowNyanerProxy();
        // 传入目标对象，返回一个代理对象
        RrowIPlay neko = proxy.getInstance(new Nekoha());
        // 代理对象来调用方法
        neko.play();
        neko.eat();
    }
}
