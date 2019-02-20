package com.imooc.design.principle.compositionaggregation;

/**
 * @ClassName MySqlConnection
 * @Description
 * @Author <a href="mailto:amaze.wu@zkteco.com">amaze.wu</a>
 * @Date 2019/2/19 13:54
 * @Version 1.0
 **/
public class MySqlConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MySql数据库连接";
    }
}
