class Solution {
    public int[] findErrorNums(int[] nums) {
        int ar[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        n=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            hm.merge(nums[i],1,Integer::sum);
        }
        for(Integer key:hm.keySet())
        {
            
            if(hm.get(key)==2)
            ar[0]=key;
        }
        ar[1]=(n-(sum-ar[0]));
        return ar;
    }
}