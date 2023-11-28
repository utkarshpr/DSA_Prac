class Solution {
    public int longestSubarray(int[] nums) {
      int i=0,j=0;
	       int c=0;
	       boolean flag=false;
	       int max=Integer.MIN_VALUE;
	       while(j<nums.length)
	       {
	           if(nums[j]==0)
	           {
	        	   flag=true;
	                c++;
	           }
	           if(c == 1)
	           {
	               max=Math.max(max,j-i+1);
	               j++;
	           }
	           else if(c> 1){
	               while(c!=1)
	               {
	            	   if(nums[i]==0)
	            	   {
	            		  
	            		   c--;
	            	   }
	            	   i++;
	               }
	               
	                j++;
	                
	           }
	           else{
	               //i++;
	               j++;
	           }

	       } 
	       return flag?max-1:nums.length-1;
    }
}