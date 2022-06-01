package com.study.prototype.deep;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.*;
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

    /*
    *  深克隆方式1:成员对象也进行克隆(递归克隆)
    * */
    public DeepConcretePrototype deepClone(){
        try {
            DeepConcretePrototype deepConcretePrototype = ((DeepConcretePrototype) super.clone());
            // clone 是Arraylist里的方法
            deepConcretePrototype.hobbies1 = (List)((ArrayList) deepConcretePrototype.hobbies1).clone();
            return deepConcretePrototype;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // 序列化克隆,这里要实现序列化接口
    public DeepConcretePrototype serializableClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ((DeepConcretePrototype) ois.readObject());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 通过json的方式反序列化
    public DeepConcretePrototype deepCloneJson(){
        String jsonObject = JSON.toJSONString(this);
        return JSON.parseObject(jsonObject,DeepConcretePrototype.class);
    }









}
