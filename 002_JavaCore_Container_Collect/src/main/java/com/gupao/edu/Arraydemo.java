package com.gupao.edu;

/**
 * @author: Rrow
 * @date: 2022/4/23 15:45
 */
public class Arraydemo {
    public static void main(String[] args) {
        char[] char1 = new char[]{'1', '2', '3'};
        char[] char2 = new char[3];
        /*
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
            会出现数组下标越界的问题
                1.数组内存地址是连续的，使用前必须指定长度
                2.通过下标访问的方式效率高
                3.增删会影响性能
         */
        System.out.printf("第三个索引值为:", char1[3]);
    }
}
