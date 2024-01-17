class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        //ans=getOverlapping(intervals);
         Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
         for(int i=0;i<intervals.length;i++)
         {
            if(ans.size()>0 && ans.get(ans.size()-1).get(1)>=intervals[i][0])
            {
                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
            }
            else{
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                ans.add(temp);
            }
         }
         int s[][]=new int [ans.size()][2];
         for(int i=0;i<s.length;i++)
         {
             s[i][0]=ans.get(i).get(0);
             s[i][1]=ans.get(i).get(1);
         }
         return s;
    }
}