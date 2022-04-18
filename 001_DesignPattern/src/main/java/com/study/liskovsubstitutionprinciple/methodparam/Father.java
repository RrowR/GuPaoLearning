package com.study.liskovsubstitutionprinciple.methodparam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Rrow
 * @date: 2022/4/18 22:53
 */
public class Father {
    public void getBean(HashMap map){
        System.out.println("我是父类的方法 ... ");
    }
}
