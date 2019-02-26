package com.imooc.design.pattern.creational.singleton;

import java.awt.event.ContainerListener;

/**
 * Created by amaze on 2019-02-24.
 */
public class T implements  Runnable {
    public void run() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
      //  LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        StaticinnerClassSingleton staticinnerClassSingleton = StaticinnerClassSingleton.getInstance();
        ContainerSingleton.putInstance("Object",new Object());
        Object instance = ContainerSingleton.getInstance("Object");
        System.out.println(Thread.currentThread().getName()+""+instance);
    }
}
