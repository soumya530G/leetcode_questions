class Solution {
    public int[] countBits(int n) {
       int[] ans = new int[n + 1];
        for(int i = 0; i < n; i++){
            ans[i] = 0;
        }
        for(int i = 1; i < n + 1; i++){
            //even 
            if(i % 2 == 0){
               ans[i] = ans[i / 2]; 
            }
            //x/2
            else{
                ans[i] = 1 + ans[i / 2];
            }
            
        }
        return ans;
    }
}