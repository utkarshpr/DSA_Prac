class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int dp[][]=new int[n][n+1];//strt from -1 and goes  till n-1;
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
       return helper(arr,0,(int)-1,dp);
    }

    private static int helper(int[] arr, int n, int prev,int dp[][]) {
        if(n == arr.length)
            return 0;
        int taken=Integer.MIN_VALUE;
        if( dp[n][prev+1] != -1) return dp[n][prev+1];
        if( prev == -1 || arr[prev]< arr[n])
        {
            taken= 1+helper(arr, n+1, n,dp);
        }
        int nottaken= 0+ helper(arr, n+1, prev,dp);

         dp[n][prev+1]=Math.max(taken, nottaken);

         return dp[n][prev+1];

    }
}