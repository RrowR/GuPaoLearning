package com.study.decoratorpattern.v1.battercake;

/**
 * @author: Rrow
 * @date: 2022/6/6 18:46
 */
public class BetterCakeWithChocolateAndFruit extends BetterCakeWithChocolate{

    protected String getMsg(){return super.getMsg() + "还加了水果";}

    public int getPrice(){return super.getPrice() + 50;}


}
