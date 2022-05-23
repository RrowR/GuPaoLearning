package com.study.factorymode.factorymethod;

/**
 * @author: Rrow
 * @date: 2022/5/24 6:47
 */
public class TestMainMethodFactory {
    public static void main(String[] args) {
        /*
        * 抽象出一个工厂接口，每个工厂去实现这个工厂接口，每个工厂只去生产自己的对象
        * 后面需要扩展的时候，只需要创建一个新的工厂去实现这个工厂接口即可
        * 除了使用工厂接口，还可以使用工厂的抽象类，把一些东西放到这个抽象类里去
        * */
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.create().getCourse();
        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        pythonCourseFactory.create().getCourse();
    }
}
