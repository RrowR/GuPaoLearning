package com.study.dependencyinversionprinciple;

import org.junit.jupiter.api.Test;

/**
 * @author: Rrow
 * @date: 2022/4/13 22:36
 */
public class DiTest {

    /*
    * v1:面向实现编程
    * 会造成nachaco在想添加新方法的时候，需要给这个nachacco这个对象添加新的方法，对程序造成污染,造成程序的不稳定性
    * */
    @Test
    void face2implementCode(){
        Nachaco nachaco = new Nachaco();
        nachaco.studyJava();
        nachaco.studyPython();
        nachaco.studyC();
    }

    /*
        V2
        编写一个含有学习方法的接口，编写不同的学习方法去实现这个接口
        那么这个用户在调用自己学习方法的时候，传入这个接口，实现不同方法的学习，不会动Tom的学习方法
     */
    @Test
    void v2Inversion(){
        Tom tom = new Tom();
        tom.study(new PythonCourse());
        tom.study(new JavaCourse());
    }

    /*
      v3
      基于构造方法的注入
      但是存在一个问题，对象是单例的就不行了
    * */
    @Test
    void v3Inversion(){
        Jim jim = new Jim(new JavaCourse());
        jim.study();
    }

    /*
        通过set方法进行注入,无视单例模式，只是会被覆盖而已
     */
    @Test
    void v4Intersion(){
        Cheery cheery = new Cheery();
        cheery.setiCourse(new JavaCourse());
        cheery.study();
        cheery.setiCourse(new PythonCourse());
        cheery.study();
    }

}
