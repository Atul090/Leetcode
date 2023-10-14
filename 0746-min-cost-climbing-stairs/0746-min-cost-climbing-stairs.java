
// using dynamic programming (memoization+tabulation) TC: O(n)
//bottom up approach
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}


/*
//using DP with memoization
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        int ans=Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        return ans;
    }
    public int solve(int[] cost,int n,int[] dp){
        if(n==0)return cost[0];
        if(n==1)return cost[1];
        dp[n]=cost[n]+Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        return dp[n];
    }
}*/


/*
using recursion TLE
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int ans=Math.min(solve(cost,n-1),solve(cost,n-2));
        return ans;
    }
    public int solve(int[] cost,int n){
        if(n==0)return cost[0];
        if(n==1)return cost[1];
        int ans=cost[n]+Math.min(solve(cost,n-1),solve(cost,n-2));
        return ans;
    }
}*/