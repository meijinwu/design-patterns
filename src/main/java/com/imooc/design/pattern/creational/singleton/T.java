package com.imooc.design.pattern.creational.singleton;

/**
 * Created by amaze on 2019-02-24.
 */
public class T implements  Runnable {
    public void run() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
      //  LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        StaticinnerClassSingleton staticinnerClassSingleton = StaticinnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+""+staticinnerClassSingleton);
    }
}
