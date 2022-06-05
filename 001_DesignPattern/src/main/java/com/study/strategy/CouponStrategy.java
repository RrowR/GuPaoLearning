package com.study.strategy;

/**
 * @author: Rrow
 * @date: 2022/6/5 21:16
 */
public class CouponStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券折扣");
    }
}
