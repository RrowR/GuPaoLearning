package com.study.strategy;

/**
 * @author: Rrow
 * @date: 2022/6/5 21:38
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doPromotion();
    }
}
