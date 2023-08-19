class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;

        for (int j = 1; j < prices.length; j++) {
            if (prices[j] > prices[i]) {
                profit = Math.max(profit, prices[j] - prices[i]);
            } else {
                i = j;
            }
        }
        return profit;
    }
}

/*
could be done in O(n2) complexity as well(Brute force)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int i=0;i<accounts.length;i++){
            int tempWealth=0;
            for(int j=0;j<accounts[i].length;j++){
                tempWealth=tempWealth+accounts[i][j];
            }
        if(tempWealth>wealth)
            wealth=tempWealth;
        }
    return wealth;
    }
}
*/ 
