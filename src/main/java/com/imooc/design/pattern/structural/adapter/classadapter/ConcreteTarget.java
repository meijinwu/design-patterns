package com.imooc.design.pattern.structural.adapter.classadapter;

/**
 * Created by amaze on 2019-02-20.
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("ConcreteTarget 目标方法");
    }
}
