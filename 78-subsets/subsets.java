class Solution {
    public List<List<Integer>> subsets(int[] ar) {
        List<List<Integer>> res=new ArrayList<>();
		List<Integer> a=new ArrayList<>();
		//int ar[]= {1,2,3};
		returnSubset(ar,0,res,a);
        return res;
    }
    public  void returnSubset(int[] ar, int i, List<List<Integer>> res, List<Integer> a) {
		if(i==ar.length)
		{
			res.add(new ArrayList<>(a));
			return;
		}
		a.add(ar[i]);
		returnSubset(ar, i+1, res, a);
		a.remove(a.size()-1);
		returnSubset(ar, i+1, res, a);
		
	}
}