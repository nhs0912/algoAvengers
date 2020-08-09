class Solution {
    int left = 0;
    int right =0;
    boolean[] checkArr;
    //검색 시작
    public int search(int[] nums, int target) {

        this.checkArr = new boolean[nums.length];
        //left, right setting
        this.left = 0;
        this.right = nums.length-1;
        if(nums.length == 1){
            if(target == nums[0]){
                return 0;
            }else{
                return -1;
            }
        }
        //중앙 값 = point
        int point = (this.left + this.right)/2;

        return binarySearch(nums , target, point);

    }

    public int binarySearch(int[] nums, int target , int point ){

            //이미 check를 하였으면
            if(checkArr[point]==true){
                return -1;
            }

            if(target == nums[point]){
                // 동일하면 index 반환
                return point;
            }else if(target > nums[point]){
                //검색한 값이 target 보다 크면
                this.left = point+1;
                this.checkArr[point] = true;
                point = (this.left + this.right)/2;

                return binarySearch(nums, target, point);

            }else{
                //검색한 값이 target 보다 작으면
                this.right = point-1;
                this.checkArr[point] = true;
                point = (this.left + this.right)/2;
                return binarySearch(nums, target, point);
            }


    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,3,5,9,12};
        int result = new Solution().search(arr,2);
        System.out.println(result);

    }
}
