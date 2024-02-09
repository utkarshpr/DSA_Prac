class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                int ar[]=new int[2];
                ar[0]=i;
                ar[1]=hm.get(target-nums[i]);
                return ar;
            }
            else{
                hm.put(nums[i], i);
            }
        }
        return new int[2];  
    }
}