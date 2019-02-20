package com.imooc.design.pattern.behavioral.strategy;

/**
 * Created by amaze on 2019-02-20.
 */
public class FanXianPromotionStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("返现出现,返现的金额放到慕课网的余额中");
    }
}
