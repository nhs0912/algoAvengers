package com.lds.topcoder;

import java.util.Arrays;

/**
 * p.93 02 암호
 *  - 곱의 증가율은 배열 구성요소 중 가장 작은 수가 커질 때 가장 커진다.
 */
public class Cryptography {

    long[] numbers = {1000, 999, 998, 997, 996, 995};

    public void run() {

        System.out.println(this.encrypt());
    }

    private long encrypt() {

        Arrays.sort(numbers);
        numbers[0]++; // 최솟값 1 증가

        long result = 1;
        for (long number : numbers) {
            result *= number;
        }

        return result;
    }
}
