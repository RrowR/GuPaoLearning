package com.study.factorymode.abstractfactory;

/**
 * @author: Rrow
 * @date: 2022/5/24 7:32
 */
public class MyMovie implements IMovie{
    @Override
    public void getMovie() {
        System.out.println("这是我最喜欢的电影");
    }
}
