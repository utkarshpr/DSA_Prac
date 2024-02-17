class Solution {
    public int maxProfit(int[] Arr) {
        int n=Arr.length;
        int profit = 0;
    int dp[][] = new int[n + 1][2 + 1];
    dp[n][0] = dp[n][1] = 0;
    for (int ind = n - 1; ind >= 0; ind--) {
        for (int buy = 0; buy <= 1; buy++) {
            if (buy == 0) { // We can buy the stock
                profit = Math.max(0 + dp[ind + 1][0], -Arr[ind] + dp[ind + 1][1]);
            }

            if (buy == 1) { // We can sell the stock
                profit = Math.max(0 + dp[ind + 1][1], Arr[ind] + dp[ind + 1][0]);
            }

            dp[ind][buy] = profit;
      }
    }
    // return helper(Arr,0,0,dp);
    return dp[0][0];
  }
}