package com.study.strategy;

/**
 * @author: Rrow
 * @date: 2022/6/5 21:21
 */
public class EmptyPromotionStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无任务优惠...");
    }
}
