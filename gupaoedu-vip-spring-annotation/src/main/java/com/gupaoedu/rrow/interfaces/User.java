package com.gupaoedu.rrow.interfaces;

import org.springframework.context.annotation.Primary;

/**
 * @author: Rrow
 * @date: 2022/6/11 15:51
 */
public class User {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
