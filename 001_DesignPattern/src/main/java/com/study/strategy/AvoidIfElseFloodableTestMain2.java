package com.study.strategy;

/**
 * @author: Rrow
 * @date: 2022/6/5 21:41
 */
public class AvoidIfElseFloodableTestMain2 {
    public static void main(String[] args) {
        /**
         * 还是没有解决IFELSE泛滥的问题,以为只使用了策略模式，因为还需要一个工厂模式
         */
        String promotion = "团购";
        // IPromotionStrategy strategy = null;
        PromotionActivity activity = null;
        if ("团购".equals(promotion)) {
            activity = new PromotionActivity(new GroupBuyStrategy());
        } else if ("返现".equals(promotion)) {
            activity = new PromotionActivity(new CaskBackStrategy());
        }else if ("没有返现".equals(promotion)){
            activity = new PromotionActivity(new EmptyPromotionStrategy());
        }
        activity.execute();
    }
}
