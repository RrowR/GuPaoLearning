package com.study.dependencyinversionprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/13 23:06
 */
public class Cheery {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.study();
    }
}
