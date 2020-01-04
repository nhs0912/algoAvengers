package com.lds.topcoder;

import java.util.Arrays;

/**
 * p.65 01 키위 주스
 */
public class KiwiJuiceEasy {

    public void run() {

        int[] capacities = {30, 20, 10};
        int[] bottles = {10, 5, 5};
        int[] fromId = {0, 1, 2};
        int[] toId = {1, 2, 0};

        System.out.println(Arrays.toString(this.thePouring(capacities, bottles, fromId, toId)));
    }

    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {

        for (int i : fromId) {

            int f = fromId[i];
            int t = toId[i];
            int space = capacities[t] - bottles[t]; // 옮길 쥬스병의 남은 용량

            /*
            if(space >= bottles[f] ){

                int vol = bottles[f];
                bottles[f] = 0; // bottles[f] -= vol
                bottles[t] += vol;

            } else {

                int vol = space;
                bottles[t] += vol;
                bottles[f] -= vol;
            }
            */

            int vol = Math.min(bottles[f], space);
            bottles[f] -= vol;
            bottles[t] += vol;
        }

        return bottles;
    }
}
