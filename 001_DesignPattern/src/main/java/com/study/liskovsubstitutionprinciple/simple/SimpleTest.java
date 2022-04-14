package com.study.liskovsubstitutionprinciple.simple;

/**
 * @author: Rrow
 * @date: 2022/4/14 22:35
 * 里氏替换原则，对父类的方法进行扩展，子类不应该修改父类的方法
 */
public class SimpleTest {

    // 定义一个自增长度的方法
    public static void resize(Rectangle rectangle) {
        while (rectangle.getHeight() >= rectangle.getWidth()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("rectangle.getWidth() = " + rectangle.getWidth() + " rectangle.getHeight() = " + rectangle.getHeight());
        }
        System.out.println("FinalSize rectangle.getWidth() = " + rectangle.getWidth() + " rectangle.getHeight() = " + rectangle.getHeight());
    }


    public static void main(String[] args) {
        // 可以扩展
        // Rectangle rectangle = new Rectangle();
        // rectangle.setHeight(10);
        // rectangle.setWidth(3);
        // resize(rectangle);

        // 继承的正方形不适用长方形
        Square square = new Square();
        square.setLenth(10);
        resize(square);


    }
}
