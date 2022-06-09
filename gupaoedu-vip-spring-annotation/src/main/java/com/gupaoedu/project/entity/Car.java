package com.gupaoedu.project.entity;

/**
 * Created by Tom.
 */
public class Car {
    public Car() {
        System.out.println("car constructor");
    }

    public void addOil(){
        System.out.println("drivce add oil before");
    }

    public void run(){
        System.out.println("drving");
    }

    public void close(){
        System.out.println("stop car");
    }
}
