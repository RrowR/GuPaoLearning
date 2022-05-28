package com.study.proxymode.generate;

/**
 * @author: Rrow
 * @date: 2022/5/28 16:50
 */
public class ProxyMan implements IBuySomeThing{

    private IBuySomeThing iBuySomeThing;


    public ProxyMan(IBuySomeThing iBuySomeThing) {
        this.iBuySomeThing = iBuySomeThing;
    }

    @Override
    public void bugThings() {
        before();
        iBuySomeThing.bugThings();
        after();
    }

    private void before(){
        System.out.println("购买之前的准备");
    }

    private void after(){
        System.out.println("购买完毕。。。");
    }
}
