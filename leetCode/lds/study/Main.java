package com.lds.study;

import com.lds.leetcode.FindNumber;
import com.lds.leetcode.LongestCommonPrefix;
import com.lds.leetcode.PalindromeNumber;
import com.lds.topcoder.*;

public class Main {

    public static void main(String[] args) {

        //String[] strs = {"c","acc","ccc"};
        String[] strs = {"flower","flow","flight"};

        LongestCommonPrefix run = new LongestCommonPrefix();
        System.out.println(run.longestCommonPrefix(strs));
    }
}