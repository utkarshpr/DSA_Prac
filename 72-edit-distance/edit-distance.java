class Solution {
    public int minDistance(String s1, String s2) {
			int dp[][]=new int[s1.length()][s2.length()];
        for(int x[]:dp)
            Arrays.fill(x, -1);
        return helper(s1,s2,s1.length()-1,s2.length()-1,dp);
    }

    private static int helper(String s1, String s2, int i, int j,int dp[][]) {
         
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;

        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i) ==  s2.charAt(j)){
            return dp[i][j]= 0+ helper(s1, s2, i-1, j-1,dp);
        }
        else{
            int insert= 1+helper(s1, s2, i, j-1,dp);
            int delete = 1+helper(s1, s2, i-1, j,dp);
            int repl=1+helper(s1, s2, i-1, j-1,dp);
            return dp[i][j]= Math.min(delete, Math.min(insert, repl));
        }
    }
}
