package com.imooc.design.pattern.creational.builder;

/**
 * Created by amaze on 2019-02-27.
 */
public class Test {
    public static void main(String[] args){
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java设计模式精讲","Java设计精讲PPT","Java设计模式精讲视屏","Java设计模式精讲手记","问答");
            System.out.println(course);
    }
}
