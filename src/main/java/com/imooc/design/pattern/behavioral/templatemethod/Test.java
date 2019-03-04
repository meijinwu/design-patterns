package com.imooc.design.pattern.behavioral.templatemethod;

/**
 * Created by amaze on 2019-03-04.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程Start -----");
        ACourse designPattern = new DesignPatternCourse();
        designPattern.makeCourse();
        System.out.println("后端设计模式课程End -----");

        System.out.println("前端课程Start -----");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程End -----");
    }
}
