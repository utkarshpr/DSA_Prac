class Solution {
    public int missingNumber(int[] nums) {
        int s=(nums.length*(nums.length+1))/2;
        for(int i:nums)
        {
            s-=i;
        }
        return s;
    }
}