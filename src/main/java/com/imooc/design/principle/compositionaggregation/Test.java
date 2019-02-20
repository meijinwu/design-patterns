package com.imooc.design.principle.compositionaggregation;

/**
 * @ClassName Test
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 14:11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
