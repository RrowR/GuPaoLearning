package com.study.factorymode.simplefactory;

import org.junit.platform.commons.util.StringUtils;

/**
 * @author: Rrow
 * @date: 2022/5/24 5:55
 */
public class CourseFactory {

    Course course;

    public Course getCourse(String name) {
        if (StringUtils.isBlank(name)) {
            return null;
        } else {
            if (name.equalsIgnoreCase("java")) {
                course = new JavaCourse();
            }
            if (name.equalsIgnoreCase("python")) {
                course = new PythonCourse();
            }
        }
        return course;
    }

}
