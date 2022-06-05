package com.study.strategy;

/**
 * @author: Rrow
 * @date: 2022/6/5 21:20
 */
public class GroupBuyStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("这是一个团购策略，有5个人购买....");
    }
}
