class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int i=0,j=0;
	      int s=0;
	      int max=Integer.MAX_VALUE;
	      while(j<nums.length)
	      {
	          s+=nums[j];
	          if(s>=target)
	          {
	              max=Math.min(max,j-i+1);
	              while(s>=target){
	                  
	                  max = Math.min(max, j - i+1);
	                    s -= nums[i++];
	            }
	             
	              j++;
	          }
	          else {
	        	  j++;
	          }
	          
	      } 
	      return max==Integer.MAX_VALUE?0:max;
    }
}