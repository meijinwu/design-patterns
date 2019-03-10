package com.imooc.design.pattern.structural.proxy;

/**
 * Created by amaze on 2019-03-10.
 */
public class OrderDaoImpl implements IOrderDao {
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
