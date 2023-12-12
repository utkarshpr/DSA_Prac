class Solution {
    public int shipWithinDays(int[] weights, int days) {
    int l=Integer.MAX_VALUE,r=0;
    	for(int i:weights)
    	{
    		l=Math.min(l, i);
    		r+=i;
    	}
    	
    	while(l<=r)
    	{
    		int mid=(l+r)/2;
    		if(helper(mid,days,weights))
    		{
    			r=mid-1;
    		}
    		else {
    			l=mid+1;
    		}
    		
    	}
    	return l;
    	
        
    }
    
    
    
	
    private static boolean helper(int mid, int days, int[] weights) {
		int c=0;
		int sum=0;
		for(int i=0;i<weights.length;i++)
		{
			if(weights[i]<=mid)
			{
				sum+=weights[i];
				if(sum>=mid)
				{
					c++;
					if(sum<=mid)
					{
						sum=0;
					}
					else {
						sum=weights[i];
					}
					
				}
			}
			else {
				return false;
			}
		}
		if(sum!=0)
		{
			c++;
			if(sum<=mid)
				sum=0;
			else
				c++;
		}
		return c<=days;
		
	}

}