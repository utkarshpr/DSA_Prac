class Solution {
    public int minimumTotal(List<List<Integer>> tr) {
        int triangle[][]=convertTo2DArray(tr); 
              int dp[][] = new int[tr.size()][tr.size()];
        for (int row[] : dp)
            Arrays.fill(row, -1);
       return helper(triangle,0,0,tr.size(),dp);
    }

    private static int helper(int[][] triangle, int i, int j, int n,int dp[][]) {
        if(i == n-1){
            return dp[i][j]=triangle[i][j];
        }
        if(dp[i][j]!=-1)
			{
				return dp[i][j];
			}
        int down=triangle[i][j]+helper(triangle, i+1, j, n,dp);
        int daig=triangle[i][j]+helper(triangle, i+1, j+1, n,dp);
        return dp[i][j]=Math.min(daig, down);
    }

    public static int[][] convertTo2DArray(List<List<Integer>> listOfLists) {
        int numRows = listOfLists.size();
        int[][] twoDArray = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentList = listOfLists.get(i);
            int numCols = currentList.size();
            twoDArray[i] = new int[numCols];

            for (int j = 0; j < numCols; j++) {
                twoDArray[i][j] = currentList.get(j);
            }
        }

        return twoDArray;
    }
}