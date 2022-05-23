package com.study.factorymode.factorymethod;

import com.study.factorymode.simplefactory.Course;

/**
 * @author: Rrow
 * @date: 2022/5/24 5:52
 */
public class PythonCourse implements ICourse {
    @Override
    public void getCourse() {
        System.out.println("创建了一个python课程");
    }
}
