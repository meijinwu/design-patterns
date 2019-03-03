package com.imooc.design.pattern.structural.decorator.v2;

/**
 * Created by amaze on 2019-03-03.
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }

    @Override
    protected void doSomething() {

    }
}
