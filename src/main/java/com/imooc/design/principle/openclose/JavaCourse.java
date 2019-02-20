package com.imooc.design.principle.openclose;

/**
 * @ClassName JavaCourse
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 10:33
 * @Version 1.0
 **/
public class JavaCourse implements ICourse{
    private Integer Id;
    private String name;
    private Double price;


    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
