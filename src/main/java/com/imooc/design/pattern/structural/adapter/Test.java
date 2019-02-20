package com.imooc.design.pattern.structural.adapter;

/**
 * Created by amaze on 2019-02-20.
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 =  new PowerAdapter();
        dc5.outPutDC5V();
    }
}
