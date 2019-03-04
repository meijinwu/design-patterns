package com.imooc.design.pattern.structural.facade;

/**
 * Created by amaze on 2019-03-04.
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
//        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
//        giftExchangeService.setQualifyServicek(new QualifyService());
//        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.giftExchange(pointsGift);
    }
}
