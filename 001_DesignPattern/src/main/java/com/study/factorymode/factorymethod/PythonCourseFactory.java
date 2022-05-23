package com.study.factorymode.factorymethod;

/**
 * @author: Rrow
 * @date: 2022/5/24 6:42
 */
public class PythonCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
