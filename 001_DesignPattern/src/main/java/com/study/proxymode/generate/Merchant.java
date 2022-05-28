package com.study.proxymode.generate;

/**
 * @author: Rrow
 * @date: 2022/5/28 16:49
 */
public class Merchant implements IBuySomeThing{

    @Override
    public void bugThings() {
        System.out.println("从我这里可以购买商品");
    }
}
