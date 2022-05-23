package com.study.factorymode.simplefactory;

/**
 * @author: Rrow
 * @date: 2022/5/24 5:53
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        // 没有使用工厂的方法
        // Course course = new JavaCourse();
        // course.getCourse();

        // 但是这个版本还会出现问题，比如传入的参数不符合要求
        // CourseFactory courseFactory = new CourseFactory();
        // Course course = courseFactory.getCourse("python");
        // course.getCourse();

        // 直接传入对应的对象的字节码，通过反射来创建对象
        CourseFactoryByClass factory = new CourseFactoryByClass();
        Course course = factory.getCourse(PythonCourse.class);
        course.getCourse();


    }
}
