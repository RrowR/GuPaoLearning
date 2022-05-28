package com.study.vip.singleton;

import com.study.singtonmode.hungry.seriable.SeriableSingleton;

import java.io.*;

/**
 * @author: Rrow
 * @date: 2022/5/28 14:10
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream ois = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("seriableObj.obj"));
            // 对象输出流写出到文件
            objectOutputStream.writeObject(s2);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // 对象输入流序列化到内存
            ois = new ObjectInputStream(new FileInputStream("seriableObj.obj"));
            s1 = ((SeriableSingleton) ois.readObject());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 反序列化还是会破坏单例
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);



    }
}
