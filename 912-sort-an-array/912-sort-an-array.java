class Solution {
    public int[] sortArray(int[] nums) {
        //Bubble sort - TLE
        /*for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = 0; j < nums.length - 1; j++)
            {
                if(nums[j + 1] < nums[j])
                {
                  int temp = nums[j];
                  nums[j] = nums[j+1];
                 nums[j+1] = temp;
                }
            }
        }
        //Selection sort
        for(int i = 0; i < nums.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[min] > nums[j])
                {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }*/
        //Insertion sort
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i - 1; j >= 0; j--)
            {
                if(nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
        return nums;
    }
}