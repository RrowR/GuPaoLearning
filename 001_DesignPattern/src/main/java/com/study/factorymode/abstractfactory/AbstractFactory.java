package com.study.factorymode.abstractfactory;

/**
 * @author: Rrow
 * @date: 2022/5/24 7:31
 */
public interface AbstractFactory {

    ICourse createCourse();

    IMovie createMovie();

}
