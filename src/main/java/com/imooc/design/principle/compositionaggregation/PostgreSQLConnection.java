package com.imooc.design.principle.compositionaggregation;

/**
 * @ClassName PostgreSQLConnection
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 13:55
 * @Version 1.0
 **/
public class PostgreSQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
