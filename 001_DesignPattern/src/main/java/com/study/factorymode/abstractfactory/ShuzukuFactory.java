package com.study.factorymode.abstractfactory;

/**
 * @author: Rrow
 * @date: 2022/5/24 7:38
 */
public class ShuzukuFactory implements AbstractFactory{
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public IMovie createMovie() {
        return new MyMovie();
    }
}
