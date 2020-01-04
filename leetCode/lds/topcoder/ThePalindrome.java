package com.lds.topcoder;

/**
 * p.113 04.회문
 */
public class ThePalindrome {

    public void run() {

        String base = "abdfhdyrbdbsdfghjkllkjhgfds";

        char[] baseList = base.toCharArray();
        int length = base.length();
        int plusCnt = 0;

        for(int i=0 ; i<length; i++) {

            int compareRight = length-1;
            for(int j=i ; j <length; j++) {

              int compareLeft = j;

              if(baseList[compareLeft] == baseList[compareRight]) {
                  System.out.println(length + plusCnt);
                  return;
              } else {
                  plusCnt++;
              }
            }
        }
    }
}
