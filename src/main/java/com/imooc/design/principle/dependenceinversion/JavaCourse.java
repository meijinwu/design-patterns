package com.imooc.design.principle.dependenceinversion;

/**
 * @ClassName JavaCourse
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:50
 * @Version 1.0
 **/
public class JavaCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("Amaze在学习Java课程");
    }
}
