package com.imooc.design.pattern.structural.adapter.objectadapter;

/**
 * Created by amaze on 2019-02-20.
 */
public class ConcreteTarget implements Target{
    public void request() {
        System.out.println("具体目标方法");
    }
}
