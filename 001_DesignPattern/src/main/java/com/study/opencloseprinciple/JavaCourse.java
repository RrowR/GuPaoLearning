package com.study.opencloseprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/13 21:56
 */
public class JavaCourse implements ICourse{

    private int id;
    private String name;
    private double price;

    public JavaCourse(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
