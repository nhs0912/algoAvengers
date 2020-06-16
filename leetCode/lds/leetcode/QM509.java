package com.lds.leetcode;

/**
 * 509. Fibonacci Number
 */
class QM509Solution {
    
    // 재귀함수 방식
    public int fib(int N) {

        if(N==0 || N==1) {
            return N;
        } else {
            return fib(N-1) + fib(N-2);
        }
    }
    
    // 반복문 방식
    public int fibByLoop(int N) {

        if(N<=1) {
            return N;
        } else {

            int fibNum1 = 0;
            int fibNum2 = 1;
            int fibNum = 0;

            for (int i = 1; i < N; i++) {

                fibNum = fibNum1 + fibNum2;
                fibNum1 = fibNum2;
                fibNum2 = fibNum;
            }

            return fibNum;
        }
    }
}

public class QM509 {

    public static void main(String[] args) {

        QM509Solution solution = new QM509Solution();
        System.out.println("fibNum = " + solution.fibByLoop(10));
    }
}
