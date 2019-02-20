package com.imooc.design.principle.singleresponsibility;

/**
 * @ClassName ICourse
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 10:57
 * @Version 1.0
 **/
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void StudeyCourse();
    void RefundCourse();
}
