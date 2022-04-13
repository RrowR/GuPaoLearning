package com.study.simpleresponsibilityprinciple.interfaced;

/**
 * @author: Rrow
 * @date: 2022/4/13 23:39
 * 不符合接口单一指责
 */
public interface ICourse {
    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
