package com.study.liskovsubstitutionprinciple.methodparam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Rrow
 * @date: 2022/4/18 22:55
 */

/*
* 父类的入参要比子类的入参要小
* 否则再调用子类重载的方法时，会出现多态左边对象不一致导致执行方法变换的问题
* */
public class TestMethodParam {
    public static void main(String[] args) {
        Son son = new Son();
        HashMap hashMap = new HashMap();
        Map map = new HashMap();
        son.getBean(map);
    }
}
