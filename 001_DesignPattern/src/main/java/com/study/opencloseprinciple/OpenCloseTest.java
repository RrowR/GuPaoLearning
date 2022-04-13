package com.study.opencloseprinciple;

/**
 * @author: Rrow
 * @date: 2022/4/13 22:08
 */

public class OpenCloseTest {
    /*
    * 开闭原则
    *   对扩展开放(继承创建新的方法)，对修改关闭(不去修改原有的get方法)
    * */
    public static void main(String[] args) {
        // 创建课程价格类
        // ICourse iCourse = new JavaCourse(1,"猫羽雫",1111.1);
        // System.out.println("id = " + iCourse.getId() + "\nname = "
        //         + iCourse.getName() +
        //         "\nprice = " + iCourse.getPrice());
        /*
            当我们需要对价格进行打折的时候，可能需要对get方法进行修改，那么就会对代码造成侵入性
            最好的解决方案就是去继承这个类，自己生成一个方法
         */
        ICourse iCourse = new JavaDiscountCourse(1,"猫羽雫",1111.1);
        // 由于接口里没有这个getDisCountPrice,需要对接口进行强转
        // 这样即可拿到原价，也可以拿到折扣价
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("id = " + discountCourse.getId() + "\nname = "
                + discountCourse.getName() +
                "\nprice = " + discountCourse.getPrice() +
                "\ndiscountPrice = " + discountCourse.getDisCountPrice());

    }

}
