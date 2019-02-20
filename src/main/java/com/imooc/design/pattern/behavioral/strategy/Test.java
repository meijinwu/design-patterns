package com.imooc.design.pattern.behavioral.strategy;

/**
 * Created by amaze on 2019-02-20.
 */
public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity11 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity11.executePromotionStrategy();

    }
}
