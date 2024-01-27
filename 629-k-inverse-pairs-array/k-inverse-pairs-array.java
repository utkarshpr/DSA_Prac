class Solution {
           int mod = (int) 1e9+7;
    public int kInversePairs(int n, int k) {
      int[][] dp = new int[n+1][k+1];

        for(int[] it : dp){
            Arrays.fill(it, -1);
        }

        return helper(n,k,dp);
    }

    private int helper(int n, int k, int[][] dp){
        if(k==0)
            return 1;
        if(n==0||k<0)
            return 0;
        if(dp[n][k] != -1){
            return dp[n][k];
        }

        int ans    = (helper(n-1,k,dp)+helper(n,k-1,dp))  %mod;

        return dp[n][k]=(ans-(k-n>=0 ? helper(n-1,k-n,dp):0)+mod)%mod; 
    }
}