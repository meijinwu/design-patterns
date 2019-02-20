package com.imooc.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Child
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:30
 * @Version 1.0
 **/
public class Child extends Base {
//    @Override
//    public void method(HashMap hashMap) {
//        super.method(hashMap);
//    }

    public void method(Map map){
        System.out.println("子类HashMap入参方法被执行");
    }
}
