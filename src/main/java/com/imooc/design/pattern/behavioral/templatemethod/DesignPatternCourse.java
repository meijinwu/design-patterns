package com.imooc.design.pattern.behavioral.templatemethod;

/**
 * Created by amaze on 2019-03-04.
 */
public class DesignPatternCourse extends ACourse{
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
