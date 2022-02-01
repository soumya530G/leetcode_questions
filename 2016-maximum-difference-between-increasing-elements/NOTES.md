class Solution {
public int maximumDifference(int[] nums) {
int i = 0;
int j = 1;
int max = -1;
int b = 0;
while(j < nums.length)
{
if(i < j)
{
if(nums[i] < nums[j])
{
if(nums[j] - nums[i] > max)
{
max = nums[j] - nums[i];
System.out.println("max is " + max);
}
}
}
i++;
j++;
}
return max;
}
}