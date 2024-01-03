class Solution {
    public boolean predictTheWinner(int[] nums) {
        return helper(nums,0,nums.length-1,0,0);
    }
    public boolean helper(int[] nums,int i,int j,int a,int b)
    {
        if(i>j)
        {
            return a>=b;
        }
        else{
            if(j-i>=2)
            {
            return (
                helper(nums,i+2,j,a+nums[i],b+nums[i+1])&&
                helper(nums,i+1,j-1,a+nums[i],b+nums[j]))||(
                helper(nums,i+1,j-1,a+nums[j],b+nums[i])&&
                helper(nums,i,j-2,a+nums[j],b+nums[j-1])
            );
            }
            else
            {
                return helper(nums,i+1,j,a+nums[i],b);
            }
        }
    }
}