class Solution {

    int[] arr;
    int target = 0;
    public int execute(int[] arr,int target){
        this.arr = arr;
        this.target = target;
        return binarySearch(this.arr,0,arr.length);
    }

    //binary Search
    public int binarySearch(int[] arr,int start, int end){

        int half = (start + end)/2;

        if(start == end){
            return -1;
        }

        if(this.target == arr[half]){
            return half;
        }else if(this.target<arr[half]){
            return binarySearch(arr,start,half);
        }else if(this.target> arr[half]){
            return binarySearch(arr,half+1,end);

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4};
        int target = -1;
        int result = new Solution().execute(arr,target);
        System.out.println(result);
    }
}
