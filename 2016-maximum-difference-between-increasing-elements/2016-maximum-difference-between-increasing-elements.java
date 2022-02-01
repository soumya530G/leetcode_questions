class Solution {
    public int maximumDifference(int[] nums) {
           int b = nums[0];
           int max = -1;
           for(int i = 1; i < nums.length; i++)
           {
               if(nums[i] > b)
               {
                   if(max < nums[i] - b)
                   {
                       max = nums[i] - b;
                   }
               }
               else
               {
                   b = nums[i];
               }
           }
        return max;
    }
}