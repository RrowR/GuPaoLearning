package com.gupao.array;

import java.util.Iterator;
import java.util.List;

/**
 * @author: Rrow
 * @date: 2022/5/8 12:23
 */
public class ThreadIterator extends Thread{

    private List list;

    public ThreadIterator(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            for (Iterator iteratorTmp = list.iterator();iteratorTmp.hasNext();){
                iteratorTmp.next();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
