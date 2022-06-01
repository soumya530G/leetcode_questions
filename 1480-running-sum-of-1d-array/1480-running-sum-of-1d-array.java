class Solution {
    public int[] runningSum(int[] nums) {
        int count = 0;
        int k = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            count++;
            for(int j = 0; j < count; j++){
                ans[k] += nums[j];
            }
            k++;
        }
        return ans;
    }
}