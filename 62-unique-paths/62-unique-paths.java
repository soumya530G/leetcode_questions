class Solution {
    public int uniquePaths(int m, int n) {
       return helper(m - 1, n - 1, new int[m][n]);
    }
    private int helper(int p, int q, int[][] mem){
       if(p == 0 || q == 0){
           return 1;
       } 
       else if(p < 0 || q < 0){
           return 0;
       }
        else if(mem[p][q] > 0){
            return mem[p][q];
        }
       mem[p][q] = helper(p - 1, q, mem) + helper(p, q - 1, mem);
       return mem[p][q];
    }
}