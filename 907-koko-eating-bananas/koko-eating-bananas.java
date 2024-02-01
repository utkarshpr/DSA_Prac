class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int l=1;
        int r=0;
        for(int i=0;i<piles.length;i++)
        {
            r=Math.max(r,piles[i]);
        }
        
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int count=helper(mid,piles);
            if(count<=h)
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }  
        return l;  
    }
    private static int helper(int mid, int[] piles) {
        int s=0;
        for(int i=0;i<piles.length;i++)
            s+=Math.ceil((double)piles[i]/((double)mid *1.0));
         return s;   
    }
}