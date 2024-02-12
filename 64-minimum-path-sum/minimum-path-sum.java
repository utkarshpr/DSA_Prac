class Solution {
    public int minPathSum(int[][] matrix) {
        int n = matrix.length;
    int m = matrix[0].length;
    //for (int[] row : dp) Arrays.fill(row, -1);
    // Calculate and print the minimum sum path in the matrix
    int dp[][] = new int[n][m];

   // int dp[][] = new int[n][m];

    for (int[] row : dp) Arrays.fill(row, -1);
    //System.out.println(minSumPath(n - 1, m - 1, matrix, dp));
    //tabulation
    dp[0][0] = matrix[0][0];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (i == 0 && j == 0) {
          dp[0][0] = matrix[0][0];
          continue;
        }
        int up = matrix[i][j];
                    if (i > 0)
                        up += dp[i - 1][j]; // Add the value from above if it's not out of bounds
                    else
                        up += (int) Math.pow(10, 9); // Add a large value if out of bounds in the up direction

                    int left = matrix[i][j];
                    if (j > 0)
                        left += dp[i][j - 1]; // Add the value from the left if it's not out of bounds
                    else
                        left += (int) Math.pow(10, 9); 
        dp[i][j] = Math.min(up, left);
      }
    }
    return(dp[n - 1][m - 1]);
  }

  private static int minSumPath(int n, int m, int[][] matrix, int[][] dp) {
    if (n == 0 && m == 0) {
      return matrix[n][m];
    }
    if (n < 0 || m < 0) {
      return (int) 1e9;
    }
    if (dp[n][m] != -1) return dp[n][m];
    int up = matrix[n][m] + minSumPath(n - 1, m, matrix, dp);
    int left = matrix[n][m] + minSumPath(n, m - 1, matrix, dp);
    return dp[n][m]=Math.min(up, left);
  }
}