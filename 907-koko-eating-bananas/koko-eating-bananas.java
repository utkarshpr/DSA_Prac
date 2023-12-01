class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
         for(int i=0;i<piles.length;i++){

            r=Math.max(r, piles[i]);

        }
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(check(mid,h,piles))
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        } 
        return l;   
    }
    public static boolean check(int mid, int h, int[] v)
	{
        int x=0;
        for(int i=0;i<v.length;i++)
        {
            x+=Math.ceil((double)v[i]/(double)mid);
        }
        if(x<=h)
            return true;
        else
             return false;    
    }

}