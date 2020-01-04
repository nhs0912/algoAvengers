package com.lds.leetcode;

/**
 * 9. Palindrome Number
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        boolean result=true;

        String val = String.valueOf(x);
        int maxIdx = 0;

        // 짝수면 나눠서 -1
        if(val.length()%2==0) {

            maxIdx = val.length()/2 - 1;

        // 홀수면 그냥 나눔
        } else {

            maxIdx = val.length()/2;
        }

        System.out.println("maxIdx: " + maxIdx);

        for(int i=0; i<=maxIdx; i++) {

            if(val.charAt(i)!=val.charAt(val.length()-1-i)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
