package com.study.decoratorpattern.v2;

/**
 * @author: Rrow
 * @date: 2022/6/6 20:24
 */
public class EggDecorator extends BetterCakeDecorator{

    public EggDecorator(BaseCake baseCake) {
        super(baseCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加了一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }

}
