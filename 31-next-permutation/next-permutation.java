class Solution {
     public  static void swap(int str,int ar[])
    {
        int end=ar.length-1;
        while(str<=end)
        {
            int temp=ar[str];
            ar[str]=ar[end];
            ar[end]=temp;
            str++;
            end--;
        }
    }
    public static  void nextPermutation(int[] nums) {
        int b=0;
        int i=nums.length-1;
        while(i!=0)
        {
            if(nums[i]>nums[i-1])
            {
                b=i-1;
                break;
            }
            i--;
        }
        boolean flag=true;
        i=nums.length-1;
        while(i>0)
        {
            if(nums[b]<nums[i])
            {
                int temp=nums[i];
               nums[i]=nums[b];
               nums[b]=temp;
               flag=false;
                swap(b+1,nums);
                break;
            }
            i--;
        }
        if(flag)
       {
           swap(0,nums);
       }

    }
}