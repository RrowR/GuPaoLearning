package com.study.strategy;

/**
 * @author: Rrow
 * @date: 2022/6/5 21:18
 */
public class CaskBackStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("支付宝开始返现了");
    }
}
