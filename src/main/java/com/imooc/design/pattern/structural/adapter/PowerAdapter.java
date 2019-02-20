package com.imooc.design.pattern.structural.adapter;

/**
 * Created by amaze on 2019-02-20.
 */
public class PowerAdapter implements DC5{
    public AC220 ac220 = new AC220();
    public int outPutDC5V() {
        int adapterIntput = ac220.outPut220V();
        int adapterOutput = adapterIntput/44;
        System.out.println("使用PowerAdapter 输入电压"+adapterIntput+"V,"+"输出电压:"+adapterOutput+"V");
        return adapterOutput;
    }
}
