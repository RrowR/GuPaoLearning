package com.study.prototype.shallow;

import java.util.ArrayList;

/**
 * @author: Rrow
 * @date: 2022/5/31 1:52
 */
public class ConcreteProtoyeMain {
    public static void main(String[] args) {
        // 创建原型对象,实现了clone接口
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Neko");
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("吃");
        hobbies.add("喝");
        prototype.setHobbies(hobbies);

        // 拷贝原型对象
        ConcretePrototype cloneType = prototype.clone();
        cloneType.getHobbies().add("喵喵喵");

        System.out.println("原型对象: " + prototype);
        System.out.println("克隆对象: " + cloneType);
        System.out.println(prototype == cloneType);


        System.out.println(prototype.getName() == cloneType.getName());
        System.out.println(prototype.getAge() == cloneType.getAge());
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());

        System.out.println("原型对象的爱好 " + prototype.getHobbies());
        System.out.println("克隆对象的爱好 " + cloneType.getHobbies());

    }
}
