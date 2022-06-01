package com.study.prototype.deep;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Rrow
 * @date: 2022/5/31 1:47
 */
@Data
public class DeepConcretePrototype implements Cloneable, Serializable {
    /*
    * 浅克隆
    * */
    private int age;
    private String name;
    private List<String> hobbies1;
    private List<String> hobbies2;
    private List<String> hobbies3;

    @Override
    protected DeepConcretePrototype clone() {
        try {
            return (DeepConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public DeepConcretePrototype deepConcretePrototype(){
        try {
            DeepConcretePrototype deepConcretePrototype = ((DeepConcretePrototype) super.clone());
            // clone 是Arraylist里的方法
            deepConcretePrototype.hobbies1 = (List)((ArrayList) deepConcretePrototype.hobbies1).clone();
            return deepConcretePrototype;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

}
