package com.Arrays;
import java.util.*;
public class LC_TwoPointer {

	public static void main(String[] args) {
		int ar[]= {3,3}, target = 6;
		int x[]=new int[2];
		x=twoSum(ar,target);
		System.out.println(x[0]+" "+x[1]);

	}
	 public static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
	        int x[]=new int[2];
					for(int i=0;i<nums.length;i++)
					{
						if(!hm.containsKey(nums[i]))
						{
							ArrayList<Integer> temp=new ArrayList<>();
							temp.add(i);
							hm.put(nums[i],temp);
						}
						else{
							ArrayList<Integer> temp=hm.get(nums[i]);
							temp.add(i);
							hm.put(nums[i],temp);
						}
					}
					//System.out.println();
					for(int i=0;i<nums.length;i++)
					{
						x[0]=i;
						if(hm.containsKey(target-nums[i]))
						{
							if(nums[i] == target-nums[i] && hm.get(nums[i]).size()>1)
							{
								x[1]=hm.get(target-nums[i]).get(1);
								break;
							}
							else if(nums[i]!=(target-nums[i])){
			                    x[1]=hm.get(target-nums[i]).get(0);
			                    break;
			                }
						}
					}
					return x;
	    }

}
