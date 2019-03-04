package com.imooc.design.pattern.behavioral.chainofresponsibility;

/**
 * Created by amaze on 2019-03-04.
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();
        Course course = new Course();
        course.setName("java模式精讲");
        course.setArticle("java模式手记");
        course.setVideo("java模式视屏");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
