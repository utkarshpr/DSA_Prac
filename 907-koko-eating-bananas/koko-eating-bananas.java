class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;
        for(int i=0;i<piles.length;i++)
        {
            r=Math.max(r,piles[i]);
        }
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(ishelper(mid,piles,h))
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return l;
    }
    public boolean ishelper(int mid,int []p,int h)
    {
        int r=0;
        for(int i=0;i<p.length;i++)
        {
            r+=Math.ceil((double)p[i]/((double)mid *1.0));
        }
        if(r<=h)
            return true;
        else
            return false;    
    }
}