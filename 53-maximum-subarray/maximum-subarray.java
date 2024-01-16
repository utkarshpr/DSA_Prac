class Solution {
    public int maxSubArray(int[] nums) {
        int max=0;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max+=nums[i];
            if(max>smax)
            {
                smax=max;
            }
            if(max<0)
                max=0;
            
        }
        return smax;
    }
}