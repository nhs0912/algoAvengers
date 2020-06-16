package com.lds.leetcode;

import java.util.Arrays;

/**
 * Leet Code 912. Sort an Array
 *
 *
 */
class QM912Solution {

    public int[] sortArray(int[] nums) {

        /*
        선택정렬
         - 선택하여 정렬하는 알고리즘
          1. 가장 작은 숫자를 선택한다.
          2. 선택한 숫자를 정렬되지 않은 숫자 맨 앞과 바꾼다.
          3. 위 과정을 반복한다 (index 값 n-1 까지)
         */
        int temp = 0;
        int minIdx = 0;
        for (int i = 0; i < nums.length-1; i++) {

            minIdx = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[minIdx] > nums[j]) {
                    minIdx = j;
                }
            }

            if(nums[i] > nums[minIdx]) {
                temp = nums[i];
                nums[i] = nums[minIdx];
                nums[minIdx] = temp;
            }
        }
        return nums;
    }

    public int[] sortArrayByInsertionSort(int[] nums) {
        
        /*
        삽입정렬
         - 삽입을 이용한 정렬 알고리즘
         - 무엇을 삽입할 것인가?
           : key 값과 정렬된 리스트가 주어졌을 때, key 값을 정렬된 리스트의 알맞은 위치에 삽입.
         - 삽입정렬은 key 값을 하나씩 추가하면서 정렬한다.
          · A[1...n]이 주어진 배열이라고 한다면
          · 첫 번째는 A[2]을 정렬된 배열 A[1]에 집어넣는다.
          · 두 번째는 A[3]을 정렬된 배열 A[1, 2]에 집어넣는다.
           ...
          · N-1 번째는 A[n]을 정렬된 배열 A[1...n-1]에 집어넣는다.
          · 위와 같이 배열(부분집합) A에 원소를 하나씩 추가하면서 정렬
         */
        int nowIdx = 0; // TODO: nowIdx 변수명 좀 더 이해하기 좋게 바꿔보기
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {

            nowIdx = i;
            for (int j = i-1; j > -1; j--) {

                if(nums[j] > nums[nowIdx]) {
                    temp = nums[nowIdx];
                    nums[nowIdx] = nums[j];
                    nums[j] = temp;

                    nowIdx = j;
                } else {
                    break;
                }
            }
        }

        return nums;
    }
}

public class QM912 {

    public static void main(String[] args) {

        int[] nums = {5,2,3,1};
        QM912Solution solution = new QM912Solution();

        System.out.println("solution = " + Arrays.toString(solution.sortArrayByInsertionSort(nums)));
    }
}
