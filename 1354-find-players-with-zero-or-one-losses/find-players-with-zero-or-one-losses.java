class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
       List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<matches.length;i++)
        {
            if(!hm.containsKey(matches[i][0]))
                hm.put(matches[i][0], 0);
            
                hm.put(matches[i][1], hm.getOrDefault(matches[i][1], 0)+1);
        }
        //System.out.println(hm);
        List<Integer> zero=new ArrayList<>();
        List<Integer> one=new ArrayList<>();
        for(Integer x:hm.keySet())
        {
            if(hm.get(x)==0)
            {
                zero.add(x);
            }
            else if(hm.get(x)==1)
            {
                one.add(x);
            }
        }
        Collections.sort(zero);
        Collections.sort(one);
        ans.add(zero);
        ans.add(one);
        //System.out.println(ans);
        return ans;
    }
    
}
