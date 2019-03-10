package com.imooc.design.pattern.structural.proxy.staticproxy;

import com.imooc.design.pattern.structural.proxy.Order;

/**
 * Created by amaze on 2019-03-10.
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
