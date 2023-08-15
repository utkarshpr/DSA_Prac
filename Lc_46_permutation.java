package com.Arrays;

import java.util.*;

public class Lc_46_permutation {

	public static void main(String[] args) {
			int num[]= {1,-2,3};
			System.out.println(permute(num));
	}

	public static List<List<Integer>> permute(int[] nums) {
			List<List<Integer>> res=new ArrayList<>();
			String x=Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
			helper(res,"",x);
			return res;
			
	}

	private static void helper(List<List<Integer>> res, String string2,
			String string) {
		if(string.isEmpty())
		{
			List<Integer> ar=new ArrayList<>();
			for(int i=0;i<string2.length();i++)
			{
				if(string2.charAt(i)!='-')
					ar.add(Integer.parseInt(string2.charAt(i)+""));
				else
					ar.add(Integer.parseInt(string2.charAt(++i)+""));
					
			}
			res.add(new ArrayList<>(ar));	
			
			return;
		}
		char ch=string.charAt(0);
		for(int i1=0;i1<=string2.length();i1++)
		{
			String f=string2.substring(0, i1);
			String l=string2.substring(i1,string2.length());
			
			helper(res, f+ch+l, string.substring(1));
		}
	}
	//will work for positive and negative case
	/*public void permuteRec(int[] nums,
	 *  int begin, List<List<Integer>> result) {
        if (begin == nums.length) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int num : nums) temp.add(num);
            result.add(temp);
            return;
        }
        for (int i = begin; i < nums.length; i++) {
            // Swap
            int temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;
            
            permuteRec(nums, begin + 1, result);
            
            // Swap back
            temp = nums[begin];
            nums[begin] = nums[i];
            nums[i] = temp;
        }*/

}
