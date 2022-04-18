package com.study.liskovsubstitutionprinciple.methodreturn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Rrow
 * @date: 2022/4/18 23:13
 */
public class Base {
    public HashMap method(){
        System.out.println("我是父类的方法");
        return null;
    }

}
