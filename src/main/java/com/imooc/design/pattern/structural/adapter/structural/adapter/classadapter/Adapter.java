package com.imooc.design.pattern.structural.adapter.structural.adapter.classadapter;

/**
 * Created by amaze on 2019-02-20.
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        super.adapteeRequest();
    }
}
