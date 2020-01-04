package com.lds.topcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * p.101 재미있는 수학
 */
public class InterestingDigits {

    public void run() {

        int input = 26;

        this.digits(input);
    }

    private void digits(int input) {

        List<Integer> resultList = new ArrayList<Integer>();

        for(int i=2; i<input; i++) {

            if(input%i == 1) resultList.add(i);
        }

        System.out.println(Arrays.toString(resultList.toArray()));
    }
}
