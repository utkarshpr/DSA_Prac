class Solution {
    public int maxLength(List<String> arr) {
        String s="";
        return solve(0,arr,s,arr.size());
    }
    private static int solve(int i, List<String> arr, String s, int size) {

        if(i>=size)
        {
            return s.length();
        }
        int ex=0;
        int in=0;
        if(hasDuplicate(arr.get(i),s)){
            ex=solve(i+1, arr, s, size);
        }
        else{
            ex=solve(i+1, arr, s, size);
            in=solve(i+1, arr, s+arr.get(i), size);
        }
        return Math.max(ex, in);
       
    }
    private static boolean hasDuplicate(String s1, String s2) {
        int[] arr = new int[26];
        for(char ch:s1.toCharArray()){
            if(arr[ch-'a']>0){
                return true;
            }
            arr[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            if(arr[ch-'a']>0){
                return true;
            }
        }
        return false;
    }
}