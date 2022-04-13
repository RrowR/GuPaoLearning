package com.study.dependencyinversionprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/13 22:50
 */
public class PythonCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习python");
    }
}
