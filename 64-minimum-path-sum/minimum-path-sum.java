class Solution {
    public int minPathSum(int[][] matrix) {
        int n = matrix.length;
    int m = matrix[0].length;
    //for (int[] row : dp) Arrays.fill(row, -1);
    // Calculate and print the minimum sum path in the matrix
    int dp[][] = new int[n][m];

    for (int[] row : dp) Arrays.fill(row, -1);
    return(minSumPath(n - 1, m - 1, matrix, dp));
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