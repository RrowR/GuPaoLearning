package com.study.springbootthreaddemo.threaddemo;

/**
 * @author: Rrow
 * @date: 2022/6/27 1:26
 */
public class ThreadLock {

    Object obj = new Object();

    // 方式1
    public static synchronized void lock1() {

    }

    // 方式2
    public void lock2(){
        synchronized (obj){}
    }

    // 方式3
    public void lock3(){
        synchronized (this.getClass()){

        }
    }

    // 方式4
    public synchronized void lock4(){}



}
