package com.study.dependencyinversionprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/13 22:53
 */
public class Tom {
    public void study(ICourse iCourse){
        iCourse.study();
    }
}
