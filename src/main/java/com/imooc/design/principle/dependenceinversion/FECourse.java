package com.imooc.design.principle.dependenceinversion;

/**
 * @ClassName FECourse
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:48
 * @Version 1.0
 **/
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Amaze在学习前端课程");
    }
}
