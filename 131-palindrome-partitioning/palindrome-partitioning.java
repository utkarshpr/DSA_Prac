class Solution {
    public List<List<String>> partition(String s) {
         List<List<String>> ans=new ArrayList<>();
        List<String> path=new ArrayList<>();
        helper(s,"",0,path,ans);
        return ans;
    }
     private static void helper(String s, String string, int i, List<String> arrayList, List<List<String>> ans) {
        if(i==s.length())
        {
            ans.add(new ArrayList<>(arrayList));
            return;

        }
        for(int x=i;x<s.length();x++)
        {
            if(isPalindrome(i,x,s))
            {
                arrayList.add(s.substring(i, x+1));
                helper(s, string, x+1, arrayList, ans);
                arrayList.remove(arrayList.size()-1);

            }
        }
    }

    private static boolean isPalindrome(int i, int x, String s) {
        while(i<=x)
        {
            if(s.charAt(i++)!=s.charAt(x--))
                return false;
        }
        return true;
    }
}
