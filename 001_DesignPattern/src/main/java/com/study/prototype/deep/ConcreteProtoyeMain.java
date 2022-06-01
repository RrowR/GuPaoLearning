package com.study.prototype.deep;

import java.util.ArrayList;

/**
 * @author: Rrow
 * @date: 2022/5/31 1:52
 */
public class ConcreteProtoyeMain {
    public static void main(String[] args) {
        // 创建原型对象,实现了clone接口
        DeepConcretePrototype prototype = new DeepConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Neko");
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("吃");
        hobbies.add("喝");
        prototype.setHobbies1(hobbies);

        // 拷贝原型对象
        DeepConcretePrototype cloneType = prototype.clone();
        cloneType.getHobbies1().add("喵喵喵");

        System.out.println("原型对象: " + prototype);
        System.out.println("克隆对象: " + cloneType);
        System.out.println(prototype == cloneType);


        System.out.println(prototype.getName() == cloneType.getName());
        System.out.println(prototype.getAge() == cloneType.getAge());
        System.out.println(prototype.getHobbies1() == cloneType.getHobbies1());

        System.out.println("原型对象的爱好 " + prototype.getHobbies1());
        System.out.println("克隆对象的爱好 " + cloneType.getHobbies1());

    }
}
