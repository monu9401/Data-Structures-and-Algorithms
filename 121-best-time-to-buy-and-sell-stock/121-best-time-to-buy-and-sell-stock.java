class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(minSoFar>prices[i])
                minSoFar=prices[i];
            int p = prices[i]-minSoFar;
            if(profit<p)
                profit=p;
        }
        return profit;
    }
}