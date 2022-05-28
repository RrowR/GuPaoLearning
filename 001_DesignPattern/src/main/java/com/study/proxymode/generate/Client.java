package com.study.proxymode.generate;

/**
 * @author: Rrow
 * @date: 2022/5/28 16:27
 */
public class Client {
    public static void main(String[] args) {
        Merchant merchant = new Merchant();
        // 代理商来购买商品
        ProxyMan proxyMan = new ProxyMan(merchant);
        proxyMan.bugThings();
    }
}
