class Solution {
    public int maxProfit(int[] prices) {
        int b = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] > b)
            {
                if(profit < prices[i] - b)
                {
                    profit = prices[i] - b;
                }
            }
            else
            {
                b = prices[i];
            }
        }
        return profit;
    }
}