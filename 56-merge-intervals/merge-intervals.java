class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
    	ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    	for(int i=0;i<intervals.length;i++)
    	{
    		if(res.size()>0 && res.get(res.size()-1).get(1)>=intervals[i][0])
    		{
    			res.get(res.size()-1).set(1, Math.max(res.get(res.size()-1).get(1),intervals[i][1]));
    			
    		}
    		else {
    			ArrayList<Integer> temp=new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                res.add(temp);
            
    		}
    	}
    	 int s[][]=new int [res.size()][2];
         for(int i=0;i<s.length;i++)
         {
             s[i][0]=res.get(i).get(0);
             s[i][1]=res.get(i).get(1);
         }
         return s;
    }
}