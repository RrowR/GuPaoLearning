package com.study.decoratorpattern.v2;

/**
 * @author: Rrow
 * @date: 2022/6/6 20:20
 */
public class BetterCakeDecorator extends BaseCake {

    private BaseCake baseCake;

    public BetterCakeDecorator(BaseCake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    protected String getMsg() {
        return this.baseCake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.baseCake.getPrice();
    }
}
