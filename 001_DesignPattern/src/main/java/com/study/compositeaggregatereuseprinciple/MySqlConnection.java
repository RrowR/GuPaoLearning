package com.study.compositeaggregatereuseprinciple;

import java.sql.Connection;

/**
 * @author: Rrow
 * @date: 2022/4/19 0:17
 */
public class MySqlConnection extends DBConnection{

    @Override
    public String getConnection() {
        return "获取MySQL连接";
    }
}
