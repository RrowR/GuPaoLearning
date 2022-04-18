package com.study.compositeaggregatereuseprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/19 0:20
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println(conn);
        System.out.println("获得数据库连接");
    }


}
