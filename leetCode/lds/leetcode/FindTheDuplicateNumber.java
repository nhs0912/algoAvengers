package com.lds.leetcode;

import java.util.Arrays;

public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {

        int length = nums.length;
        int[] chkNums = new int[length];

        for (int num : nums) {
            if(num==chkNums[num]) {
                return num;
            } else {
                chkNums[num] = num;
            }
        }

        return length;
    }
}
