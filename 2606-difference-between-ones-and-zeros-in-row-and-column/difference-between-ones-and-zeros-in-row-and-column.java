class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
      int onerows[]=new int[grid.length];
      int onecol[]=new int[grid[0].length];
      for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                onerows[i] += grid[i][j];
                onecol[j] += grid[i][j];
            }
        }

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                grid[i][j]=2*(onerows[i]+onecol[j])-(grid.length+grid[0].length);
            }
        }
    return grid;
    }
}