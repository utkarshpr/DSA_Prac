class Solution {
    public int solve(int[][] grid ,int i,int j,int count,int[][] dp){
        int n = grid.length;
        int m = grid[0].length;

        if((i>=n) || (j>=m)){
            return 0;
        }
        if(grid[i][j] == 1){
            return 0;
        }
        if((i==n-1) && (j==m-1)){
            count++;
            return count;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int x = solve(grid,i+1,j,count,dp);
        int y = solve(grid,i,j+1,count,dp);

        count = x+y;
        dp[i][j] = count;
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int i = 0;
        int j = 0;
        int count = 0;

        int [][] dp = new int[n+1][m+1];
        for(int x=0;x<=n;x++){
            for(int y=0;y<=m;y++){
                dp[x][y] = -1;
            }
        }

        return solve(obstacleGrid,i,j,count,dp);
    }
}