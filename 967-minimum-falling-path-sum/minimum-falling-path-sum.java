class Solution {
    public int minFallingPathSum(int[][] matrix) {
         int dp[][] = new int[matrix.length][matrix[0].length];
        for (int row[] : dp)
            Arrays.fill(row, -1);

          for (int j = 0; j < matrix[0].length; j++) {
            dp[0][j] = matrix[0][j];

        }
        int maxi = Integer.MAX_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = matrix[i][j] + dp[i - 1][j];

                int leftDiagonal = matrix[i][j];
                if (j - 1 >= 0) {
                    leftDiagonal += dp[i - 1][j - 1];
                } else {
                    leftDiagonal += (int) Math.pow(10, 9);
                }

                int rightDiagonal = matrix[i][j];
                if (j + 1 < m) {
                    rightDiagonal += dp[i - 1][j + 1];
                } else {
                    rightDiagonal += (int) Math.pow(10, 9);
                }

                // Store the maximum of the three paths in dp
                dp[i][j] = Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }
        for (int j = 0; j < m; j++) {
            maxi = Math.min(maxi, dp[n - 1][j]);
        }

        
        return maxi; 
    }

    private static int getMaxUtil(int i, int j,  int[][] matrix,int [][]dp) {
        if(j<0 || j>matrix[0].length-1)
            return (int)1e9;
        if(i==0)
            return dp[i][j]=matrix[i][j];
            if(dp[i][j]!=-1)
                return dp[i][j];
        int up=matrix[i][j]+getMaxUtil(i-1, j, matrix,dp);
        int leftDiagonal=matrix[i][j]+getMaxUtil(i-1, j-1, matrix,dp);
        int rightDiagonal=matrix[i][j]+getMaxUtil(i-1, j+1, matrix,dp);
        return dp[i][j]=Math.min(up, Math.min(leftDiagonal, rightDiagonal));
    }
}
