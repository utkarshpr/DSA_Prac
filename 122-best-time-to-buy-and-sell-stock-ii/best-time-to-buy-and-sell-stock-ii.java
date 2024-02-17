class Solution {
    public int maxProfit(int[] Arr) {
        int n=Arr.length;
     int dp[][]=new int[n][2];
        for(int x[]:dp)
            Arrays.fill(x, -1);
        return helper(Arr,0,0,dp);
    }

    private static int helper(int[] Arr, int n, int _buy,int dp[][]) {
        if(n>=Arr.length)
            return 0;
        int profit;  
        if(dp[n][_buy]!=-1) return dp[n][_buy] ; 
        if(_buy == 0){
            profit=Math.max(-Arr[n]+helper(Arr, n+1, 1,dp), 0+helper(Arr, n+1, 0,dp));
        }   
        else{
            profit=Math.max(Arr[n]+helper(Arr, n+1,0,dp),0+helper(Arr, n+1, 1,dp));
        } 
        return dp[n][_buy]=profit;
    }
}