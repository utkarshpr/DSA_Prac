package com.Arrays;

public class A3_arrayIsSorted {

	public static void main(String[] args) {
		int ar[]= {2,3,5,6,41,44,46,52,55,343};
		boolean flag=true;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("sorted");
		else
			System.out.println("Not in sorted order");

	}

}
