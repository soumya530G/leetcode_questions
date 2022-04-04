class Solution {
    public int[] searchRange(int[] nums, int target) {
        
      int[] res = new int[2];
      res[0] = -1;
      res[1] = -1;
      int a = 0;
      int b = nums.length - 1;
      while(a <= nums.length - 1){
        if(nums[a] == target){
           res[0] = a;
           break;
           }
       a++;
       }
      while(b >= 0){
        if(nums[b] == target){
           res[1] = b;
            break;
       }
       b--;
       }
       return res;

    }
}