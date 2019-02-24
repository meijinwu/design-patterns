package com.imooc.design.pattern.creational.singleton;

import javax.swing.*;

/**
 * Created by amaze on 2019-02-24.
 */
public class StaticinnerClassSingleton {
    private static class InnerClass{
       private static  StaticinnerClassSingleton staticinnerClassSingleton = new StaticinnerClassSingleton();
    }
    public static StaticinnerClassSingleton getInstance(){
        return InnerClass.staticinnerClassSingleton;
    }
    private StaticinnerClassSingleton(){

    }
}
