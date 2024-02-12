class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
    for (int[] row : dp) Arrays.fill(row, -1);
    // return helper(m-1,n-1,dp);
    //tabular
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 && j == 0){
             dp[0][0] = 1;
             continue;
             }

        int up = 0;
        int left = 0;

        if (i > 0) up = dp[i - 1][j];
        if (j > 0) left = dp[i][j - 1];
        dp[i][j]=up+left;
      }
    }

    return dp[m - 1][n - 1];
        
    }

    private static int helper(int i, int j,int dp[][]) {
        if(i<0 || j<0){
            return 0;
        }
        if(i==0 && j==0){
            return 1;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int left=helper(i, j-1,dp);
        int up=helper(i-1, j,dp);
        return left+up;
    }
}