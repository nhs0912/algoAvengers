package com.lds.leetcode;

/**
 * Leet Code 704. Binary Search
 *  - https://leetcode.com/problems/binary-search/
 */
public class QE704 {

    public int search(int[] nums, int target) {

        int minIdx = 0;
        int maxIdx = nums.length-1;
        int midIdx = maxIdx / 2;

        while(true) {

            if( nums[midIdx] == target ) {
                return midIdx;
            } else {

                if(nums[midIdx] < target) {
                    minIdx = midIdx + 1;
                } else {
                    maxIdx = midIdx - 1;
                }

                if(minIdx>maxIdx) {
                    return -1;
                }

                midIdx = (minIdx+maxIdx) / 2;
            }
        }
    }
}
