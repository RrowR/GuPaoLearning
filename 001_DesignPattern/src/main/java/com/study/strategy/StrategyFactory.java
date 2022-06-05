package com.study.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: Rrow
 * @date: 2022/6/5 22:03
 */

/* 创建了一个策略工厂 */
public class StrategyFactory {

    // 根据Key来存不同的策略
    private static Map<String,IPromotionStrategy> PROMOTIONS = new HashMap<>();

    // 静态代码块初始化
    static {
        PROMOTIONS.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK,new CaskBackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY,new GroupBuyStrategy());
    }

    public StrategyFactory() {
    }

    // 默认设置一个策略
    private static final IPromotionStrategy EMPTY = new EmptyPromotionStrategy();

    public static IPromotionStrategy getPromotion(String promotionKey){
        IPromotionStrategy promotionStrategy = PROMOTIONS.get(promotionKey);
        // 通过三元表达式来进行判断
        return promotionStrategy == null ? EMPTY : promotionStrategy;
    }

    // 暴露折扣的有哪些key
    public Set<String> getPromotionKeys(){
        return PROMOTIONS.keySet();
    }

}
