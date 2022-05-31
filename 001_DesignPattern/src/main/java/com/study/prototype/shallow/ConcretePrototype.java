package com.study.prototype.shallow;

import lombok.Data;

import java.util.List;

/**
 * @author: Rrow
 * @date: 2022/5/31 1:47
 */
@Data
public class ConcretePrototype implements Cloneable{
    /*
    * 浅克隆
    * */
    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    protected ConcretePrototype clone() {
        try {
            return (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
