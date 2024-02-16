class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
         int dp[][] = new int[s1.length()][s2.length()];

        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
        for (int rows[] : dp)
            Arrays.fill(rows, -1);
        return helper(s1,s1.length()-1,s2,s2.length()-1,dp);
    }

    private static int helper(String s1, int n1, String s2, int n2,int dp[][]) {
        if(n1<0 || n2<0){
            return 0;
        }
        if(dp[n1][n2] !=-1 )return dp[n1][n2];
        if(s1.charAt(n1) ==  s2.charAt(n2)){
            return 1+helper(s1, n1-1, s2, n2-1,dp);
        }
        return dp[n1][n2]=Math.max(helper(s1, n1-1, s2, n2,dp),helper(s1, n1, s2, n2-1,dp));
    }
}