package com.study.delegatepattern;

/**
 * @author: Rrow
 * @date: 2022/6/1 20:32
 */
public class PlayEmployee implements IWorker{

    @Override
    public void doing(String task) {
        System.out.println("我会玩");
    }
}
