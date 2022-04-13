package com.study.simpleresponsibilityprinciple.interfaced;

/**
 * @author: Rrow
 * @date: 2022/4/14 0:10
 * 符合接口单一原则
 */
public class ICourseImpl implements ICourseInfo,ICourseManager{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
