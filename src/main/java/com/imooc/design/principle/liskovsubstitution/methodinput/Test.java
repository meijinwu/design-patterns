package com.imooc.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @ClassName Test
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:32
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
