class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
      return longestPalindromeSubseq(s1, s2);

    
  }

  public static String longestPalindromeSubseq(String s1, String s2) {
    int dp[][] = new int[s1.length() + 1][s2.length() + 1];
    for (int i = 0; i < dp.length; i++) {
      dp[i][0] = 0;
    }
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < dp[0].length; i++) dp[0][i] = 0;

    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
          dp[i][j] = 1 + dp[i - 1][j - 1];
          max = Math.max(max, dp[i][j]);
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }

    int i = s1.length(), j = s2.length();
    String res = "";
    while (i > 0 && j > 0) {
      if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
        res += s1.charAt(i - 1) ;
        i = i - 1;
        j = j - 1;
      } else {
        if (dp[i - 1][j] > dp[i][j - 1]) {
            res+=s1.charAt(i-1);
          i = i - 1;
        } else {
            res+=s2.charAt(j-1);
          j = j - 1;
        }
      }
    }

    while(i>0){
        res += s1.charAt(i-1);
        i--;
    }
    while(j>0){
        res += s2.charAt(j-1);
        j--;
    }
    String ans2=new StringBuilder(res).reverse().toString();
    return ans2;
  }
}
