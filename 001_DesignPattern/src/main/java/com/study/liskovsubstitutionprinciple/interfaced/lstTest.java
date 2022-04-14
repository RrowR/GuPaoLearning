package com.study.liskovsubstitutionprinciple.interfaced;

import com.study.liskovsubstitutionprinciple.simple.Rectangle;
import com.study.liskovsubstitutionprinciple.simple.Square;

/**
 * @author: Rrow
 * @date: 2022/4/14 22:35
 * 里氏替换原则，对父类的方法进行扩展，子类不应该修改父类的方法
 *  接口抽象之后，接口中将不会有设置Square里的宽的方法，编译的时候都不会让你通过
 *  解决了子类继承父类之后方法调用错误的问题，编译的时候就限定死
 */
public class lstTest {

    // 定义一个自增长度的方法      四边形失效
    public static void resize(QuadRangle rectangle) {
        while (rectangle.getHeight() >= rectangle.getWidth()) {

            // 抽象的接口，不能使用setWidth 因为这个接口里没有这个方法，要么添加这个接口方法，要么只能使用Rectangle对象
            // rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("rectangle.getWidth() = " + rectangle.getWidth() + " rectangle.getHeight() = " + rectangle.getHeight());
        }
        System.out.println("FinalSize rectangle.getWidth() = " + rectangle.getWidth() + " rectangle.getHeight() = " + rectangle.getHeight());
    }


    public static void main(String[] args) {

    }
}
