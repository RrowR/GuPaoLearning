package com.gupao.array;

import java.util.List;

/**
 * @author: Rrow
 * @date: 2022/5/8 12:30
 */
public class ThreadAdd extends Thread{
    private List list;

    public ThreadAdd(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("循环执行" + i + "次");
            try {
                Thread.sleep(5);
                list.add(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
