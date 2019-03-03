package com.imooc.design.pattern.structural.decorator.v2;

/**
 * Created by amaze on 2019-03-03.
 */
public class Battercake extends ABattercake{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
