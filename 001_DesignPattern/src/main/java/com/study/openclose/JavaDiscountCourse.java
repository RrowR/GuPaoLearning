package com.study.openclose;

/**
 * @author: Rrow
 * @date: 2022/4/13 22:15
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(int id, String name, double price) {
        super(id, name, price);
    }

    public double getDisCountPrice() {
        return getPrice() * 0.6;
    }

}
