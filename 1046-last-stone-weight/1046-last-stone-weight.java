class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            pq.add(stones[i]);
        }
        while(pq.size() != 1){
             if(pq.size() != 0){
                int x = pq.remove();
           
            int y = pq.remove();
            if(x != y){
                if(y > x){
                    pq.add(y - x);
                }
                else if(x > y){
                    pq.add(x - y);
                }
            } 
             } else {
                 break;
             }
        }
        if(pq.size() == 1) return pq.remove();
       // int n = pq.remove();
        return 0;
    }
}