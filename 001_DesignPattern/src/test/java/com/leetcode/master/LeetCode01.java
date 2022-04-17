package com.leetcode.master;

/**
 * @author: Rrow
 * @date: 2022/4/17 22:09
 */
public class LeetCode01 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println("singleNumber(nums) = " + singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
    //    找到nums里只出现一次的数字
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
