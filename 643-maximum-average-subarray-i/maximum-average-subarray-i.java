class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i=0,j=0;
        int s=0;
        int max= Integer.MIN_VALUE;
        while(j<nums.length)
        {
            s+=nums[j];
            if(j-i+1 == k)
            {
            	max=Math.max(max, s);
            	j++;
            }
            else if( j-i+1 < k)
            {
            	j++;
            }
            else{
            	while(j-i+1> k)
            	{
            		s=s-nums[i];
            		i++;
            	}
            	max=Math.max(max, s);
            	j++;
            }
            
        }
       
        return ((double)max/(double)k) ;
    }
}