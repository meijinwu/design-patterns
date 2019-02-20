package com.imooc.design.pattern.behavioral.strategy;

/**
 * Created by amaze on 2019-02-20.
 */
public class LiJianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
