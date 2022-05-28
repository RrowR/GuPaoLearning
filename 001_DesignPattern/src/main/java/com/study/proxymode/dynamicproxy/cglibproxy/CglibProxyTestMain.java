package com.study.proxymode.dynamicproxy.cglibproxy;

/**
 * @author: Rrow
 * @date: 2022/5/29 3:36
 */
public class CglibProxyTestMain {
    public static void main(String[] args) {
        Shuzuku shuzuku = (Shuzuku) new NekohaProxy().getInstance(Shuzuku.class);
        shuzuku.play();
    }
}
