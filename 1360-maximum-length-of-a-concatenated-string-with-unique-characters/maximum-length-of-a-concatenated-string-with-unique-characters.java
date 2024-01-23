class Solution {
    public int maxLength(List<String> arr) {
        
        int maxLen = 0;
        List<String> result = new ArrayList<>();
        result.add("");
        for(String w:arr)
        {
            for(int i=0;i<result.size();i++)
            {
                String word2 = result.get(i) + w;
                if (isSelfUnique2(word2)){
                    result.add(word2);
                    maxLen = Math.max(maxLen, word2.length());
                }
            }
        }
        //System.out.println(result);
        return maxLen;
    }
    private static boolean isSelfUnique2(String str){
        Set<Character> strSet = new HashSet<>();
        for(char c : str.toCharArray())
            if (!strSet.add(c)) return false;
        return true;
    }
   
}
