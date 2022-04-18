package com.study.liskovsubstitutionprinciple.methodreturn;

/**
 * @author: Rrow
 * @date: 2022/4/18 23:14
 */
public class TestReturnMethod {

    /*
    *   子类在继承父类的时候，子类的重载父类方法的返回值应比父类要严格
    *   否则子类程序会直接报错
    *   返回类型java.util.Map与java.util.HashMap不兼容
    * */
    public static void main(String[] args) {
        Base base = new Child();
        base.method();
    }

}
