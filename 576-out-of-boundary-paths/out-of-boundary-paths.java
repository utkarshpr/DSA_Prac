class Solution {
   static int MOD = 1_000_000_007;
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
       long[][][] dp = new long[m][n][maxMove + 1];
        for (long[][] i : dp) {
            for (long[] j : i) {
                Arrays.fill(j, -1);
            }
        }
    
    return (int)helper(m,n,maxMove,startRow,startColumn,dp);
    }
    private static long helper(int m, int n, int maxMove, int startRow, int startColumn, long[][][] dp) {
       if(startRow<0 || startRow>=m||startColumn<0||startColumn>=n)
        return 1;
        if(maxMove == 0)
            return 0;
        if(dp[startRow][startColumn][maxMove]>=0)
                return dp[startRow][startColumn][maxMove];
        long res=0;
        res+=helper(m, n, maxMove-1, startRow+1, startColumn, dp)  ;
        res %= MOD;
        res+=helper(m, n, maxMove-1, startRow-1, startColumn, dp)  ;
        res %= MOD; 
        res+=helper(m, n, maxMove-1, startRow, startColumn+1, dp)  ;
        res %= MOD; 
        res+=helper(m, n, maxMove-1, startRow, startColumn-1, dp)  ;
        res %= MOD;       
       return dp[startRow][startColumn][maxMove]=res;
    }
}