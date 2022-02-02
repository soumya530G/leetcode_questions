class Solution {
    public int maxSubArray(int[] nums) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int max = -10000000;
        for(int i = 0; i < nums.length; i++)
        {
            if(sum >= 0)
            {
                sum += nums[i];
            }
            else
            {
                sum = nums[i];
            }
            if(sum > max)
            {
                max = sum;
            }
        }
        return max;
    }
}