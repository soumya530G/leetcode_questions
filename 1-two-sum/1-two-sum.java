class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n1 = 0;
        int n2 = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int fq = map.get(nums[i]);
                int nf = fq + 1;
                map.put(nums[i], nf);
            }else{
              map.put(nums[i], 1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int f = map.get(nums[i]);
                int nff = f - 1;
                map.put(nums[i], nff);
            }
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) > 0){
                n1 = nums[i];
                n2 = target - nums[i];
                break;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == n1 || nums[i] == n2){
                ans.add(i);
            }
        }
         int[] arr = new int[ans.size()];
          for (int i = 0; i < ans.size(); i++)
            arr[i] = ans.get(i);
        return arr;
    }
}