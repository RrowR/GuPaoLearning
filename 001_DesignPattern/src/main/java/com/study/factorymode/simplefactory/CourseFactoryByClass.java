package com.study.factorymode.simplefactory;

/**
 * @author: Rrow
 * @date: 2022/5/24 6:00
 */
public class CourseFactoryByClass {

    Course course;

    public Course getCourse(Class clazz) {
        // 不适合逻辑复杂的场景，违背开闭原则，而且返回值写死，这里只能是Course
        if (null != clazz) {
            try {
                return  ((Course) clazz.newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
