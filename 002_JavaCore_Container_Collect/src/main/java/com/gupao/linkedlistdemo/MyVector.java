package com.gupao.linkedlistdemo;

import java.util.*;

/**
 * @author: Rrow
 * @date: 2022/5/10 0:23
 */
public class MyVector {

    private static List list = new ArrayList();

    public static void main(String[] args) {
        // 里面的方法都是加锁的，所以都是数据安全的
        Vector<Object> vector = new Vector<>();
        vector.add(1);
        List synchronizedList = Collections.synchronizedList(list);


    }

}
