class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.merge(nums[i],1,Integer::sum);
            
        }
        int s=nums.length/2;
        for(int x:hm.keySet())
        {
            if(hm.get(x)>s)
            {
                return x;
            }
        }
        return -1;
    }
}