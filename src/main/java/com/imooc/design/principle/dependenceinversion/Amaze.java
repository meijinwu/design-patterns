package com.imooc.design.principle.dependenceinversion;

/**
 * @ClassName Amaze
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:49
 * @Version 1.0
 **/
public class Amaze {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
