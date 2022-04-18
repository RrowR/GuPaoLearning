package com.study.compositeaggregatereuseprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/19 0:18
 */
public class OracleConnection extends DBConnection{

    @Override
    public String getConnection() {
        return "获取Oracle连接";
    }
}
