package com.study.decoratorpattern.v1.battercake;

/**
 * @author: Rrow
 * @date: 2022/6/6 18:49
 */

/*
* 随着继承越来越多，程序会越来越耦合，程序越来越膨胀
* */
public class TestMain {
    public static void main(String[] args) {
        BetterCake cake = new BetterCake();
        System.out.println("价格为:" + cake.getPrice() + "     名字为:" + cake.getMsg());

        BetterCakeWithChocolate cakeWithChocolate = new BetterCakeWithChocolate();
        System.out.println("价格为:" + cakeWithChocolate.getPrice() + "     名字为:" + cakeWithChocolate.getMsg());

        // BetterCakeWithChocolateAndFruit cakeWithChocolateAndFruit = new BetterCakeWithChocolateAndFruit();
        // System.out.println("价格为:" + cakeWithChocolateAndFruit.getPrice() + "     名字为:" + cakeWithChocolateAndFruit.getMsg());
    }
}
