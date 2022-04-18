package com.study.liskovsubstitutionprinciple.methodparam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Rrow
 * @date: 2022/4/18 22:54
 */
public class Son extends Father{
    // @Override
    // public void getBean(HashMap map) {
    //     System.out.println("我是子类的方法");
    // }

    public void getBean(Map map) {
        System.out.println("我是子类重载的方法");
    }
}
