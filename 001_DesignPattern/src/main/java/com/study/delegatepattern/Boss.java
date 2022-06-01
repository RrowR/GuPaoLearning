package com.study.delegatepattern;

/**
 * @author: Rrow
 * @date: 2022/6/1 20:49
 */
public class Boss {
    public static void command(String task,IWorker worker){
        worker.doing(task);
    }
}
