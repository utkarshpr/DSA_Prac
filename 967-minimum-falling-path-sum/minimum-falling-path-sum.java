class Solution {
    public int minFallingPathSum(int[][] A) {
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            dp[0][i] = A[0][i];
        }
        
        int down = Integer.MAX_VALUE, left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
        for(int row = 1; row < n; row++) {
            for(int col = 0; col < n; col++) {
                down = dp[row - 1][col];
                if(col == 0) {
                    right = dp[row - 1][col + 1];
                    dp[row][col] = A[row][col] + Math.min(down, right);
                }
                else if (col == n - 1) {
                    left = dp[row - 1][col - 1];
                    dp[row][col] = A[row][col] + Math.min(down, left);
                }
                else {
                    left = dp[row - 1][col - 1];
                    right = dp[row - 1][col + 1];
                    dp[row][col] = A[row][col] + Math.min(down, Math.min(left, right));
                }
            }
        }

        for(int col = 0; col < n; col++)
            ans = Math.min(ans, dp[n - 1][col]);
        
        return ans;
    }        
}