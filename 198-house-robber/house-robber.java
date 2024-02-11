class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp, -1);
       return helper(nums,nums.length-1,dp);
    }

    private static int helper(int[] nums, int n,int [] dp) {
        // if(n<0) return 0;
        // if(n==0) return dp[n]=nums[0];
        // if(dp[n] != -1 )return dp[n];
        // int pick=nums[n]+helper(nums, n-2,dp);
        // int nonpick=helper(nums, n-1,dp);
        // return dp[n]=Math.max(pick, nonpick);

        dp[0]=nums[0];
        if(n>=1)
            dp[1]=Math.max(nums[0], nums[1]);
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n];
    }
}