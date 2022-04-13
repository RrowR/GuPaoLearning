package com.study.simpleresponsibilityprinciple.method;

/**
 * @author: Rrow
 * @date: 2022/4/14 0:16
 * 方法单一原则，一个方法内不应该还有多个逻辑
 */
public class MethodSimple {
    // 不符合方法单一原则,将if/else方法进行抽出
    public int changeDate(int date,boolean bool){
        if (bool == true){
            date = date + 1;
        }else {
            date = date - 1;
        }
        return date;
    }

    public int datePlus(int date){
        return date + 1;
    }

    public int dateSub(int date){
        return date - 1;
    }
}
