public class BubbleSort {

    public int[] Solution(int[] nums) {
        //배열 Size
        int numsSize = nums.length;
        for (int i = 1; i < numsSize; i++) {
            //기준 number
            int baseNum = nums[i];
            int baseIndex = i;
            for (int j = i-1; j >= 0; j--) {
                //기준 number와 탐색한 숫자랑 비교해서 기준number가 작으면 교환
                if (baseNum < nums[j]) {
                    swap(nums, baseIndex, j);
                    baseNum = nums[j];
                    baseIndex = j;
                }
            }
        }
        return nums;
    }
    // 두 숫자를 교환한다.
    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    // 배열 output
    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 3, 6, 7, 5};
        BubbleSort bs = new BubbleSort();
        int[] outNums = bs.Solution(nums);
        bs.display(outNums);
    }
}
