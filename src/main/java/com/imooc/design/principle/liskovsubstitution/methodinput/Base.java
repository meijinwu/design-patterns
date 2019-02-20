package com.imooc.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @ClassName Base
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:29
 * @Version 1.0
 **/
public class Base {
    public void method(HashMap hashMap){
        System.out.println("父类被执行");
    }
}
