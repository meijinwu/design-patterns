package com.imooc.design.pattern.structural.decorator.v2;

/**
 * Created by amaze on 2019-03-03.
 */
public abstract class AbstractDecorator extends ABattercake{
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }
    protected abstract void doSomething();
    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
