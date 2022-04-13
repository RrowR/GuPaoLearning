package com.study.simpleresponsibilityprinciple.clazz;

import org.junit.jupiter.api.Test;

/**
 * @author: Rrow
 * @date: 2022/4/13 23:28
 * 类方法单一职责
 */
public class Course {
    /*
        不符合单一职责原则，一个学习方法里包含了2个功能，当有进行方法的修改的时候，修改修改ifElse里面的代码
     */
    @Test
    public void notSimpleResponsibility(String maoYuna){
        if ("猫羽雫".equals(maoYuna)){
            System.out.println("你是猫羽雫");
        }else {
            System.out.println("你不是猫羽雫");
        }
    }

    /*
        符合单一原则
        可以在方法里进行判断
     */
    @Test
    public void simpleResponsibility(String maoYuna){
        if ("猫羽雫".equals(maoYuna)){
            IsMaoYuna.nyaYa(maoYuna);
        }else {
            IsNotMaoYuna.notNya(maoYuna);
        }
    }
}
