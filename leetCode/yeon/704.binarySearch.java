class Solution {
    public int search(int[] nums, int target) {
            
        int point = nums.length / 2;
        
        return binarySearch(nums , target, point);
        
    }
    
    public int binarySearch(int[] nums, int target , int point ){
        
        if(nums.length > point){ 
            if(target == nums[point]){ 
             // 동일하면 index 반환 
            
               return point;
           }else if(target > nums[point]){
            
            if(point == point + ((nums.length-point)/2)
                || target < nums[point+1]){
                return -1;
            }
        
             point = point + ((nums.length-point)/2);
            
             return binarySearch(nums, target, point);
                
            }else{
              if(point == (point/2) 
                  || target > nums[point-1]){
                  return -1;
              }
              point = point / 2;
            
              return binarySearch(nums, target, point);
            }
        }
        return -1;
    }
}
