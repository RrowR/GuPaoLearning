package com.study.factorymode.abstractfactory;

/**
 * @author: Rrow
 * @date: 2022/5/24 7:32
 */
public class JavaCourse implements ICourse{
    @Override
    public void getCourse() {
        System.out.println("这是一个java课程");
    }
}
