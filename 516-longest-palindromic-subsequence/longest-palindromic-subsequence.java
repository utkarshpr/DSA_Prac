class Solution {
    public int longestPalindromeSubseq(String s1) {
        StringBuilder sb=new StringBuilder(s1);
        String s2=sb.reverse().toString();
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<dp[0].length;i++)
            dp[0][i]=0;
        
            for(int i=1;i<dp.length;i++){
                for(int j=1;j<dp[0].length;j++){
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        dp[i][j]=1+dp[i-1][j-1];
                        max=Math.max(max, dp[i][j]);
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[s1.length()][s2.length()];
    }
}