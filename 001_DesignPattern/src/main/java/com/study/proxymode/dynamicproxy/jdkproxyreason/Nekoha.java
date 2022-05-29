package com.study.proxymode.dynamicproxy.jdkproxyreason;

/**
 * @author: Rrow
 * @date: 2022/5/29 1:55
 */
public class Nekoha implements RrowIPlay {
    @Override
    public void play() {
        System.out.println("play with nekoha");
    }

    @Override
    public void eat() {
        System.out.println("nekoha eat");
    }
}
