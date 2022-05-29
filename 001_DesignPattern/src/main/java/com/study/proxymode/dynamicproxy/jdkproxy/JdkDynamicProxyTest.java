package com.study.proxymode.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author: Rrow
 * @date: 2022/5/29 2:24
 */
public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        NyanerProxy proxy = new NyanerProxy();
        // 传入目标对象，返回一个代理对象
        // IPlay neko = (IPlay) proxy.getInstance(new Nekoha());
        IPlay neko = ((IPlay) proxy.getInstance(new Nekoha()));
        // 代理对象来调用方法
        neko.play();

        // 代理工具类，并不是java.lang.reflect包下的内容
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IPlay.class});
        try {
            // 生成出一个代理类，可以用IDEA来进行反编译
            FileOutputStream fileOutputStream = new FileOutputStream("./$Proxy0.class");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // 这里无法调用Ieat接口里的eat方法
        IEat shuzuku = (IEat) proxy.getInstance(new Shuzuku());
        // 代理对象来调用方法
        shuzuku.eat();
    }
}
