class Solution {
    public int numDistinct(String s1, String s2) {
      int dp[][]=new int[s1.length()][s2.length()];
        for(int x[]:dp)
        Arrays.fill(x, -1);
        
              return(subsequenceCounting(s1, s2, s1.length()-1, s2.length()-1,dp));
    }
    static int prime = (int) (Math.pow(10, 9) + 7);

    private static int subsequenceCounting(String s1, String s2, int i, int j,int dp[][]) {
        if(j<0)
            return 1;
        if(i<0) return 0;
        if(dp[i][j] !=-1 ) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j]=subsequenceCounting(s1, s2, i-1, j-1,dp) + subsequenceCounting(s1, s2, i-1, j,dp)%prime;
        }  
        else{
            return dp[i][j]=subsequenceCounting(s1, s2, i-1, j,dp);
        }  
    }
}