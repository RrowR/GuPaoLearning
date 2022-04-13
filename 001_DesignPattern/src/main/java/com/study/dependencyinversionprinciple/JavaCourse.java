package com.study.dependencyinversionprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/13 22:50
 */
public class JavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习java");
    }
}
