package com.imooc.design.pattern.structural.adapter.objectadapter;

/**
 * Created by amaze on 2019-02-20.
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();
    public void request() {
        adaptee.adapteeRequest();
    }
}
