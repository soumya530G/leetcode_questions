class Solution {
    public void reverse(int []nums, int i, int j)
    {
        int st = i;
        int end = j;
        while(st < end)
        {
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0)
        {
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    } 
}