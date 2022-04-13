package com.study.dependencyinversionprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/13 23:03
 */
public class Jim {
    private ICourse iCourse;

    public Jim(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study() {
        iCourse.study();
    }
}
