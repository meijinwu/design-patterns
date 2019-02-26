package com.imooc.design.pattern.creational.singleton;

/**
 * Created by amaze on 2019-02-25.
 */
public class HungrySingleton {
    //final 必须在类加载时赋值
    private final static HungrySingleton hungrySingleton;
    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
