class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int req[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            req[-'a'+s.charAt(i)]++;
            req[-'a'+t.charAt(i)]--;
        }
        for(int i=0;i<26;i++)
        {
            if(req[i]!=0)
                return false;
        }
        return true;
    }
}