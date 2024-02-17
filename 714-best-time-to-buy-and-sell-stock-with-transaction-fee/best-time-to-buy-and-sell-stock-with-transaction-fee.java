class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp[][]=new int[n][3];
        for(int x[]:dp)
            Arrays.fill(x,-1);
        return helper(prices,0,0,dp,fee)   ; 
    }
    private static int helper(int[] Arr, int n, int buy, int dp[][],int fee) {
        if(n>= Arr.length)
            return 0;
        if (dp[n][buy] != -1) return dp[n][buy];   
        int profit;
        if(buy == 0){
                profit=Math.max(-Arr[n]+helper(Arr,n+1,1,dp,fee),0+helper(Arr,n+1,0,dp,fee));
        } 
        else{
           profit= Math.max(
          Arr[n] + helper(Arr, n + 1, 0, dp,fee)-fee,
          0 + helper(Arr, n + 1, 1, dp,fee));
        }
         return dp[n][buy] = profit;
    }
     
}