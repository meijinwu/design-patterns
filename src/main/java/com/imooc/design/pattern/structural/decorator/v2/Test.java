package com.imooc.design.pattern.structural.decorator.v2;

/**
 * Created by amaze on 2019-03-03.
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        System.out.println(aBattercake.getDesc()+"销售价格:"+aBattercake.cost());
        aBattercake = new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+"销售价格:"+aBattercake.cost());
        aBattercake = new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+"销售价格:"+aBattercake.cost());
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+"销售价格:"+aBattercake.cost());
    }
}
