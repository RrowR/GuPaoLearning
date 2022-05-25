package com.leetcode.master;

import org.junit.jupiter.api.Test;

/**
 * @author: Rrow
 * @date: 2022/5/25 22:20
 */
public class TestMain {
    @Test
    public void Test01(){
        String str = "SADADA";
        byte[] bytes = str.getBytes();
        bytes[0]+=32;
        System.out.println(new String(bytes));

    }
}
