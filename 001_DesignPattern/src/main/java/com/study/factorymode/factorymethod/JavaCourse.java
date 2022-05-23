package com.study.factorymode.factorymethod;

/**
 * @author: Rrow
 * @date: 2022/5/24 5:52
 */
public class JavaCourse implements ICourse {
    @Override
    public void getCourse() {
        System.out.println("创建了一个java课程");
    }
}
