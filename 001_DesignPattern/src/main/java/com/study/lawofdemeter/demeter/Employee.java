package com.study.lawofdemeter.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Rrow
 * @date: 2022/4/14 1:20
 */
public class Employee {

    public void checkNumberOfCourses(){
        ArrayList<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            courseList.add(new Course());
        }
        System.out.println("目前已经发布的课程数量 = " + courseList.size());
    }

}
