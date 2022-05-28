package com.study.proxymode.dynamicproxy.jdkproxy;

/**
 * @author: Rrow
 * @date: 2022/5/29 1:55
 */
public class Shuzuku implements IPlay,IEat{
    @Override
    public void play() {
        System.out.println("play with Shuzuku...0.0");
    }

    @Override
    public void eat() {
        System.out.println("Shuzuku Eat");
    }
}
