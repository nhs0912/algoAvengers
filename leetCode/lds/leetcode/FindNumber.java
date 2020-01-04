package com.lds.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1295. Find Numbers with Even Number of Digits
 */
public class FindNumber {

    public int findNumbers(int[] nums) {

        int evenDigitCnt = 0;

        for(int i=0 ; i<nums.length; i++) {

            if(String.valueOf(nums[i]).length()%2==0) {
                evenDigitCnt++;
            }
        }

        return evenDigitCnt;
    }
}
