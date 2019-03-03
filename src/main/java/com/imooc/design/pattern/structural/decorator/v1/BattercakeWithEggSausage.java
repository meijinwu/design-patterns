package com.imooc.design.pattern.structural.decorator.v1;

/**
 * Created by amaze on 2019-03-03.
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
