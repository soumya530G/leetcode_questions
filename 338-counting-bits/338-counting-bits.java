class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 1; i < n + 1; i++){
            ans[i] = 0;
        }
        int offset = 1;
        for(int i = 1; i < n + 1; i++){
            if(offset * 2 == i){
                offset = i;
            }
            ans[i] = 1 + ans[i - offset];
        }
    return ans;
    }
}