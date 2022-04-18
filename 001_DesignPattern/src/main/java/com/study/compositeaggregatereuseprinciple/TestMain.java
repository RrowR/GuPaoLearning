package com.study.compositeaggregatereuseprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/19 0:10
 */
public class TestMain {
    /*
    *   合成复用原则  Composite&Aggregate Reuse Principle
    *   尽量避免使用继承,尽量不动代码
    * */
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }
}
