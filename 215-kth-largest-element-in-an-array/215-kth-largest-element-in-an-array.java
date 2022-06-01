
import java.util.Arrays; 
import java.util.Collections; 
import java.util.Scanner;
class Solution {
    public int findKthLargest(int[] nums, int k) {
       // HashMap<Integer, Integer> map = new HashMap<>();
          Arrays.sort(nums);
      /*  int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) == false){
                map.put(nums[i], count);
                count++;
            }
        }*/
        int n = nums.length - k;
        return nums[n];
      /*  int q = Math.abs(count - 1 - k);
        System.out.println(count + ":" + q);
        int ans = 0;
        for(Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == q){
                ans = entry.getKey();
                break;
            }
        }*/
      //  return ans;
    }
}