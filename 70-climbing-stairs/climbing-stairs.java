class Solution {
    public int climbStairs(int n) {
       int a=1,b=2;
        if(n==1)
            return a;
        if(n==2)
            return b;
        //12 21 111
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
            
        }
        return dp[n];

    }
    public static int climbStairs(int n,int sum) {
        if(sum>n)
        {
            return 0;
        }
        if(sum==n)
            return 1;
        int x=climbStairs(n, sum+1);
        int y=climbStairs(n, sum+2);
        return x+y;    
        
        
    }
}