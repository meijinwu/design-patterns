package com.imooc.design.pattern.creational.abstractfatory;

/**
 * Created by amaze on 2019-02-24.
 */
public class PythonCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
