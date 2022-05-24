package com.test.myextends;

/**
 * @Author: Rrow
 * @Date: 2022/5/24 08:43
 */
public class TestMain {
    public static void main(String[] args) {
        Father father = new Son();
        Son son = new Son();
        father.setName("father");
        son.setName("son");
        System.out.println("father.name = " + father.name);
        System.out.println("son.name = " + son.name);
    }
}
