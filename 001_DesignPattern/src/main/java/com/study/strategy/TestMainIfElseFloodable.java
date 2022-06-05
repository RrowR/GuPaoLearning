package com.study.strategy;

/**
 * @author: Rrow
 * @date: 2022/6/5 21:25
 */
public class TestMainIfElseFloodable {
    public static void main(String[] args) {
        /**
         * 这里会出现IfElse泛滥
         */
        String promotion = "没有返现";
        IPromotionStrategy strategy = null;
        if ("团购".equals(promotion)) {
            strategy = new GroupBuyStrategy();
        } else if ("返现".equals(promotion)) {
            strategy = new CaskBackStrategy();
        }else if ("没有返现".equals(promotion)){
            strategy = new EmptyPromotionStrategy();
        }
        strategy.doPromotion();
    }
}
