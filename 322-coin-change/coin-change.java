class Solution {
    public int coinChange(int[] arr, int T) {
     int[][] dp = new int[arr.length][T + 1];

        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
        for (int row[] : dp)
            Arrays.fill(row, -1);
        int ans=helper(arr,T,arr.length-1,dp);
        if (ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;    
        
    }

    private static int helper(int[] arr, int T, int n,int dp[][]) {
       if(n==0){
            if(T%arr[0] == 0){
                return  T/arr[0];
            }
            else
                return (int)1e9;
       }
       if(dp[n][T] !=-1) return dp[n][T];
       int notTaken = 0+helper(arr, T, n-1,dp);
       int taken=(int)1e9;
       if(arr[n]<=T){
            taken=1+helper(arr, T-arr[n] , n,dp);
       }
       return dp[n][T]=Math.min(notTaken,taken);

    }


}