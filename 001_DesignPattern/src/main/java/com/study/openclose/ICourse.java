package com.study.openclose;

/**
 * @author: Rrow
 * @date: 2022/4/13 22:04
 *  开闭原则
 *      对修改关闭，对扩展开放
 *          当有新的需求的时候，不修改代码，继承原先的类来进行功能上的扩展
 */
public interface ICourse {
    int getId();
    String getName();
    Double getPrice();
}
