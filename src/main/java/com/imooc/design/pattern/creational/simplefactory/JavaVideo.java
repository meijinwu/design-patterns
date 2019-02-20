package com.imooc.design.pattern.creational.simplefactory;

/**
 * @ClassName JavaVideo
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 10:06
 * @Version 1.0
 **/
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("Java课程视屏");
    }
}
