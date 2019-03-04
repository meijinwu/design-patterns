package com.imooc.design.pattern.behavioral.templatemethod;

/**
 * Created by amaze on 2019-03-04.
 */
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体视屏");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }
}
