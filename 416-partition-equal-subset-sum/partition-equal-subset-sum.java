class Solution {
    public boolean canPartition(int[] arr) {
      int s=0;
      int n=arr.length;
        for(int i:arr){
            s+=i;
        }
        if(s%2==0){
            int dp[][] = new int[n][s/2 + 1];

        // Initialize DP table with -1 (unprocessed)
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return helper(n-1,s/2,arr,dp);
        }
        return false;
    }

    private static boolean helper(int i, int k, int[] arr,int dp[][]) {
        if(k == 0){
            return true;
        }
        if(i == 0) return arr[i]==k;
        if(dp[i][k] !=  -1) return dp[i][k]==0?false:true;
        boolean untaken = helper(i-1, k, arr,dp);
        boolean taken=false;
        if(arr[i] <= k){
            taken=helper(i-1, k-arr[i], arr,dp);
        }
        dp[i][k]=(untaken || taken)?1:0;
       return (untaken || taken);

    }
}

