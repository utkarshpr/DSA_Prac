class Solution {
    public int subarraySum(int[] nums, int k) {
        int s=0;
        int count=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            if(hs.containsKey(s-k))
                count+=hs.get(s-k);
                hs.put(s,hs.getOrDefault(s,0)+1);    
        }
        return count;
    }
}