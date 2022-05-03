class Solution {
    public int fib(int n) {
      return fibmem(n, new int[n + 1]);
    }
    public int fibmem(int n, int[] dp){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int fibn = fibmem(n - 1, dp) + fibmem(n - 2, dp);
        dp[n] = fibn;
        return fibn;
    }
}