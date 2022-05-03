class Solution {
    public int climbStairs(int n) {
      return fib(n, new int[n+1]);
    }
    public int fib(int n, int[] dp){
       if(n <= 1) return dp[n] = 1;
       if(dp[n] != 0){
           return dp[n];
       }
       return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }
}