package com.study.lawofdemeter.demeter;

import java.util.ArrayList;

/**
 * @author: Rrow
 * @date: 2022/4/14 1:19
 */
public class TeamLeader {

    public void commandCheckNumber(Employee employee) {

        employee.checkNumberOfCourses();
    }

}
