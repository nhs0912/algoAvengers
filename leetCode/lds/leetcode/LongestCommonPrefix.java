package com.lds.leetcode;

/**
 * 14. Longest Common Prefix
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];

        String output = "";
        String baseStr = strs[0];

        for(int i=0; i<baseStr.length(); i++) {

            if(output.length()!=i) {
                break;
            }

            char baseChr = baseStr.charAt(i);

            for(int j=1; j<strs.length; j++) {

                if(strs[j].length()==0 || (i>0 && i>strs[j].length()-1)) {
                    return output;
                }

//                System.out.println("i: " + i);
//                System.out.println("j: " + j);
//                System.out.println("baseChr: " + baseChr);
//                System.out.println("strs[j].charAt(i): " + strs[j].charAt(i));

                if(baseChr!=strs[j].charAt(i)) {
                    break;
                }

                if(j==strs.length-1) {
                    output = output + String.valueOf(baseChr);
                }
            }

        }

        return output;
    }
}
