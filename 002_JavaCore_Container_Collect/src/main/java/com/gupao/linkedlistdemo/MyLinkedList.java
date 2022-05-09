package com.gupao.linkedlistdemo;

import java.util.LinkedList;

/**
 * @author: Rrow
 * @date: 2022/5/8 13:12
 */
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // 添加到首位置
        list.push(1);
        // 添加到尾位置
        list.add(1);
        // 二分从前遍历或者从尾遍历
        list.get(1);
        // 找到索引为4的值，然后替换成1
        list.set(4,1);
        // 移除第一个元素
        Object remove = list.remove();

    }
}
