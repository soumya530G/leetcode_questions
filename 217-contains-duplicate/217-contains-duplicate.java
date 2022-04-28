class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
           if(map.containsKey(nums[i])){
               
               map.put(nums[i], map.get(nums[i]) + 1);
           }
           else{
               map.put(nums[i], 1);
           }
       }
        System.out.println(map);
        int count = 0;
        for(Integer key: map.keySet()){
            if(map.get(key) >= 2){
                count++;
            }
        }
       System.out.println(count);
        if(count == 0){
            return false;
        }
        return true;
    }
}