class Solution {
    public int coinChange(int[] coins, int amount) {
        int []dp = new int[amount + 1];
        coinchange(coins, amount, dp);
        if(dp[amount] == dp.length){
            return -1;
        }
        return dp[amount];
    }
    public int coinchange(int[] coins, int amount, int[] dp){
        if(amount == 0){
            return 0;
        }
        if(dp[amount] != 0){
            return dp[amount];
        }
        dp[amount] = dp.length;
        for(int i: coins){
            if(amount >= i){
               dp[amount] = Math.min(dp[amount], coinchange(coins, amount - i, dp) + 1);
            }
        }
        return dp[amount];
    }
}