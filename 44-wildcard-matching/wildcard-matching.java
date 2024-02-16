class Solution {
    public boolean isMatch(String s2, String s1) {
     int dp[][] = new int[s1.length()][s2.length()];
    for (int row[]: dp)
      Arrays.fill(row, -1);
        return helper(s1,s2,s1.length()-1,s2.length()-1,dp)==1;
        
    }

    private static int helper(String s1, String s2, int i, int j,int dp[][]) {
        if (i < 0 && j < 0)
        return 1; // Both strings are empty, and the pattern matches.
      if (i < 0 && j >= 0)
        return 0; // S1 is empty, but there are characters left in S2.
      if (j < 0 && i >= 0)
        return isAllStars(s1, i) ? 1 : 0;

        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j) || s1.charAt(i) == '?'){
            return dp[i][j]=helper(s1, s2, i-1, j-1,dp);
        }
        else if(s1.charAt(i) == '*'){
            return dp[i][j]=(helper(s1, s2, i-1, j,dp) == 1 || helper(s1, s2, i, j-1,dp) ==1)?1:0;
        }
        else
            return dp[i][j]=0;
    }

    private static boolean isAllStars(String S1, int i) {
        for (int j = 0; j <= i; j++) {
          if (S1.charAt(j) != '*')
            return false;
        }
        return true;
    }
}
