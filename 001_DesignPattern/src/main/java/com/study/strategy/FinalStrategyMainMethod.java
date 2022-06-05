package com.study.strategy;

/**
 * @author: Rrow
 * @date: 2022/6/5 23:02
 */

/*
* 策略模式的最终解决方案
*   策略+工厂
* 非常的优雅~~~      解决了IFELSE问题
*   COUPON CASHBACK GROUPBUY
* */
public class FinalStrategyMainMethod {
    public static void main(String[] args) {
        String promotion = "GROUPBUY";
        IPromotionStrategy promotionStrategy = StrategyFactory.getPromotion(promotion);
        promotionStrategy.doPromotion();
    }
}
