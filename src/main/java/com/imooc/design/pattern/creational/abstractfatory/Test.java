package com.imooc.design.pattern.creational.abstractfatory;

/**
 * Created by amaze on 2019-02-24.
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFacotry();
        CourseFactory courseFactory1 = new PythonCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory1.getArticle();
        video.produce();
        article.produce();
    }
}
