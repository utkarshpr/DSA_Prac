class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>ar=(ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());
	ArrayList<Integer> ans = new ArrayList<>(ar);;
	int pos=0,ne=1;
	for(int i=0;i<ar.size();i++)
	{
		if(ar.get(i)>=0)
		{
			ans.set(pos, ar.get(i));
			pos+=2;
			
		}
		else {
			ans.set(ne, ar.get(i));
			ne+=2;
		}
	}
	return ans.stream().mapToInt(i->i).toArray();
    }
    
}