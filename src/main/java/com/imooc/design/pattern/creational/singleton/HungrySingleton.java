package com.imooc.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Created by amaze on 2019-02-25.
 */
public class HungrySingleton implements Serializable{
    //final 必须在类加载时赋值
    private final static HungrySingleton hungrySingleton;
    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //反射攻击解决方法
    private Object readResolve(){
        return hungrySingleton;
    }
}
