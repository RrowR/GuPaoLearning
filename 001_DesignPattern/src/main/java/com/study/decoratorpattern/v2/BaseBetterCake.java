package com.study.decoratorpattern.v2;

/**
 * @author: Rrow
 * @date: 2022/6/6 19:43
 */
public class BaseBetterCake extends BaseCake{

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
