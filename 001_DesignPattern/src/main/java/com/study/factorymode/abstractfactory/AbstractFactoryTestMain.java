package com.study.factorymode.abstractfactory;

/**
 * @author: Rrow
 * @date: 2022/5/24 7:38
 */
public class AbstractFactoryTestMain {
    public static void main(String[] args) {
        /*
        * 抽象工厂:
        *   抽象出来了一个抽象工厂接口，将所有的方法接口放到这个抽象工厂接口里去
        *   我们只需要创建一个自己的工厂去实现这个抽象工厂接口即可
        *   优点 : 规范了所有工厂类必须要有的方法
        *   缺点 : 工厂接口好进行修改，因为修改会涉及到所有子类方法的修改，一开始就要确定好
        *
        * */
        AbstractFactory nekoHaFactory = new NekoHaFactory();
        nekoHaFactory.createCourse().getCourse();
        nekoHaFactory.createMovie().getMovie();
    }
}
