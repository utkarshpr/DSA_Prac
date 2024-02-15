class Solution {
    public int change(int target, int[] arr) {
        int n=arr.length;
        int dp[][]=new int[n][target+1];
       for(int x[]:dp)
        Arrays.fill(x, -1); 
       return helper(arr,n-1,target,dp);
    }

    private static int helper(int[] arr, int n, int target,int dp[][]) {
       if(n==0){
        if(target%arr[0] == 0){
            return 1;
        }
        else{
            return 0;
        }
       }
       if(dp[n][target] !=-1)return dp[n][target];
        int nottaken=helper(arr, n-1, target,dp);
        int taken=0;
        if(arr[n]<=target){
            taken=helper(arr, n, target-arr[n],dp);
        }
        return dp[n][target]=taken+nottaken;
    }
}