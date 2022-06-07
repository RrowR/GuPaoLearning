package com.study.decoratorpattern.v1.battercake;

/**
 * @author: Rrow
 * @date: 2022/6/6 18:46
 */
public class BetterCakeWithChocolate extends BetterCake{

    protected String getMsg(){return super.getMsg() + "加了巧克力";}

    public int getPrice(){return super.getPrice() + 100;}


}
