package com.imooc.design.pattern.structural.decorator.v2;

/**
 * Created by amaze on 2019-03-03.
 */
public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }

    @Override
    protected void doSomething() {

    }
}
