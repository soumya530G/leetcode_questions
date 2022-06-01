class Solution {
    public int longestConsecutive(int[] nums) {
        //first iteration: putting values in hashmap
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int val: nums){
            map.put(val, true);
        }
        //second iteration: separate the starting points 
           for(int val : nums){
            if(map.containsKey(val - 1)){
                map.put(val , false);
            }
        }
        //third iteration: calculating the max length
        int maxlen = 0;
        for(int val: nums){
            if(map.get(val) == true){
            int templen = 1;
            while(map.containsKey(val + templen)){
                templen++;
            }
            if(maxlen < templen){
                maxlen = templen;
            }
            }
        }
        return maxlen;
    }
}