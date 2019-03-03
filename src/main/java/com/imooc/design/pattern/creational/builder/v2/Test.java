package com.imooc.design.pattern.creational.builder.v2;

/**
 * Created by amaze on 2019-03-03.
 */
public class Test {
    public static void main(String[] args){
        Course course = new Course.CourseBuilder().buildCourseName("java模式精讲").buildCoursePPT("java设计模式精讲PPT").buildCourseVideo("java设计模式精讲视屏").build();
        System.out.println(course);
    }
}
