package com.test.myextends;

/**
 * @Author: Rrow
 * @Date: 2022/5/24 08:42
 */
public class Son extends Father{

    public String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
