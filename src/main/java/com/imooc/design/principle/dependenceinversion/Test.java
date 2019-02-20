package com.imooc.design.principle.dependenceinversion;

/**
 * @ClassName Test
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 11:53
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Amaze amaze = new Amaze();
        amaze.setiCourse(new JavaCourse());
        amaze.studyImoocCourse();

        amaze.setiCourse(new FECourse());
        amaze.studyImoocCourse();

    }
}
