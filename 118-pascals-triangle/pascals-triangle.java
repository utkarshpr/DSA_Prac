class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans=new ArrayList<>();
        if(numRows >= 1)
        {
            List<Integer> ar=new ArrayList<>();
            ar.add(1);
            ans.add(ar);
            
        }
        if( numRows >= 2)
        {
            List<Integer> ar=new ArrayList<>();
            ar.add(1);
            ar.add(1);
            ans.add(ar);
            
        }
        if(numRows>2)
        {
            int x=2;
            while(x++!=numRows)
            {
                List<Integer> temp=new ArrayList<>();
                List<Integer> prev=ans.get(x-2);
                temp.add(1);
                for(int i=1;i<prev.size();i++)
                {
                    temp.add(prev.get(i-1)+prev.get(i));
                }
                temp.add(1);
                ans.add(temp);
            }
        }
        return ans;
    }
}