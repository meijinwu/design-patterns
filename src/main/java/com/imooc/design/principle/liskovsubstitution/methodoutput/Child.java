package com.imooc.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Child
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:36
 * @Version 1.0
 **/
public class Child extends Base{
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
