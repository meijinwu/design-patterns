package com.imooc.design.pattern.behavioral.strategy;

/**
 * Created by amaze on 2019-02-20.
 */
public class PromotionActivity
{
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
