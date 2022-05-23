package com.study.factorymode.simplefactory;

/**
 * @author: Rrow
 * @date: 2022/5/24 5:52
 */
public class JavaCourse implements Course{
    @Override
    public void getCourse() {
        System.out.println("创建了一个java课程");
    }
}
