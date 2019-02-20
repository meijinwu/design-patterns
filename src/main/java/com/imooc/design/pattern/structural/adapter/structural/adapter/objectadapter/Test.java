package com.imooc.design.pattern.structural.adapter.structural.adapter.objectadapter;

/**
 * Created by amaze on 2019-02-20.
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
