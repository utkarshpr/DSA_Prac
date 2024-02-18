class Solution {
    public int minCost(int n, int[] cut) {
        ArrayList<Integer> cuts = new ArrayList<>(Arrays.asList(toIntegerArray(cut)));

         int c = cuts.size();
       
        return cost(n,c,cuts);
    }
    private static int cost(int n, int c, ArrayList<Integer> cuts) {
        
        cuts.add(0);
        cuts.add(n);
        Collections.sort(cuts);
        int[][] dp = new int[c + 1][c + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
       return helper(cuts,1,c,dp);
    }

    private static int helper(ArrayList<Integer> cuts, int i, int j,int dp[][]) {
        if (i > j) {
            return 0;
        }
        int min=Integer.MAX_VALUE;
        if(dp[i][j] !=-1) return dp[i][j];
        for(int ind=i;ind<=j;ind++){
            int ans=-cuts.get(i-1)+cuts.get(j+1)+helper(cuts, i, ind-1,dp)+helper(cuts, ind+1, j,dp);
            min=Math.min(ans, min);
        }
        return dp[i][j]=min;
    }
    static Integer[] toIntegerArray(int[] array) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}