class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr)
        {
            hm.merge(i,1,Integer::sum);
        }
        List<Integer> map=hm.values().stream().toList();
        HashSet<Integer> hs=new HashSet<>(map);
        return map.size()==hs.size();
        
    }
}