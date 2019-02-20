package com.imooc.design.principle.dependenceinversion;

/**
 * @ClassName PythonCourse
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:51
 * @Version 1.0
 **/
public class PythonCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("Amaze在学习Python课程");
    }
}
