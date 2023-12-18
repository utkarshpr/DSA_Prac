class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        // System.out.println(nums[nums.length-1]*nums[nums.length-2]);
        // System.out.println(nums[0]*nums[1]);
        return ((nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]));
    }
}