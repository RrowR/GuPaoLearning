package com.study.decoratorpattern.v2;

/**
 * @author: Rrow
 * @date: 2022/6/6 18:46
 */
// 转变一个抽象组件,类和方法全部抽象话
public abstract class BaseCake {

    protected abstract String getMsg();

    public abstract int getPrice();
}
