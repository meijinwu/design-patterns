package com.imooc.design.pattern.structural.proxy;

/**
 * Created by amaze on 2019-03-10.
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
       return  iOrderDao.insert(order);
    }
}
