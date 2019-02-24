package com.imooc.design.pattern.creational.abstractfatory;

/**
 * Created by amaze on 2019-02-24.
 */
public class JavaCourseFacotry implements CourseFactory{
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
