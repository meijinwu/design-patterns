package com.imooc.design.pattern.creational.singleton;

/**
 * Created by amaze on 2019-02-24.
 */
public class Test {
    public static void main(String[] args){
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
