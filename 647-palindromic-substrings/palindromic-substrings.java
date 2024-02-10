class Solution {
    public boolean isPalindrome(String s,int i,int j){
        while(i<=j){
            int ch1=s.charAt(i);
            int ch2=s.charAt(j);
            if(ch2 != ch1){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
    public int countSubstrings(String s) {
        int max=0;
        for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) 
        {
            if(isPalindrome(s,i,j)){
                max++;
            }
        }
    }
    return max;
    }
}