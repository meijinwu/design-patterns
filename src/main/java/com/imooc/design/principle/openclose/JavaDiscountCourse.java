package com.imooc.design.principle.openclose;

/**
 * @ClassName JavaDiscountCourse
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 10:35
 * @Version 1.0
 **/
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id ,String name,Double price){
        super(id,name,price);
    }

    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }
}
