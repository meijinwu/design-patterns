package com.imooc.design.principle.openclose;

/**
 * @ClassName Test
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 10:40
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96,"java从零到开始",348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID"+javaCourse.getId()+"课程名称"+javaCourse.getName()+"课程原价"+javaCourse.getPrice()+"课程折后价"+javaCourse.getDiscountPrice()+"元");
    }
}
