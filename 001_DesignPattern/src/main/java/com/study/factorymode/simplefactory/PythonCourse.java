package com.study.factorymode.simplefactory;

/**
 * @author: Rrow
 * @date: 2022/5/24 5:52
 */
public class PythonCourse implements Course{
    @Override
    public void getCourse() {
        System.out.println("创建了一个python课程");
    }
}
