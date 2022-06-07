package com.study.decoratorpattern.v2;

/**
 * @author: Rrow
 * @date: 2022/6/6 22:21
 */
public class TestMainV2 {
    public static void main(String[] args) {
        BaseCake baseCake;
        // 最基础的类,没有办法进行包装
        baseCake = new BaseBetterCake();
        // 增强了基础（在原先基础上加了一个鸡蛋的类）
        baseCake = new BetterCakeDecorator(baseCake);
        baseCake = new EggDecorator(baseCake);
        baseCake = new EggDecorator(baseCake);
        baseCake = new EggDecorator(baseCake);
        System.out.println("价格为:" + baseCake.getPrice() + "  名字为:" + baseCake.getMsg());
    }
}
