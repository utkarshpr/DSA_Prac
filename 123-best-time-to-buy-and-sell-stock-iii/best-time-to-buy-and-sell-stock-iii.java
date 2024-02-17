class Solution {
    public int maxProfit(int[] Arr) {
        int n = Arr.length;
        int[][][] dp = new int[n][2][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        // for(int x[]:dp)
        //     Arrays.fill(x, -1);
        // int profit = 0;
        // int dp[][] = new int[n + 1][2 + 1];
        // dp[n][0] = dp[n][1] = 0;
        // for (int ind = n - 1; ind >= 0; ind--) {
        //     for (int buy = 0; buy <= 1; buy++) {
        //         if (buy == 0) { // We can buy the stock
        //             profit = Math.max(0 + dp[ind + 1][0], -Arr[ind] + dp[ind + 1][1]);
        //         }
    
        //         if (buy == 1) { // We can sell the stock
        //             profit = Math.max(0 + dp[ind + 1][1], Arr[ind] + dp[ind + 1][0]);
        //         }
    
        //         dp[ind][buy] = profit;
        //   }
        // }
        // return dp[0][0];
        return helper(Arr,0,0,2,dp);
        
      }
    
      private static int helper(int[] Arr, int n, int _buy,int cap, int dp[][][]) {
        if(cap == 0) return 0;
        if (n >= Arr.length) return 0;
        int profit;
        if (dp[n][_buy][cap] != -1) return dp[n][_buy][cap];
        if (_buy == 0) {
          profit =
            Math.max(
              -Arr[n] + helper(Arr, n + 1, 1,cap, dp),
              0 + helper(Arr, n + 1, 0,cap, dp)
            );
        } else {
          profit =
            Math.max(
              Arr[n] + helper(Arr, n + 1, 0,cap-1, dp),
              0 + helper(Arr, n + 1, 1,cap, dp)
            );
        }
        return dp[n][_buy][cap]=profit;
      }
    }
    