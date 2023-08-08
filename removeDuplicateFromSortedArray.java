package com.Arrays;

import java.util.ArrayList;
import java.util.jar.JarEntry;

public class removeDuplicateFromSortedArray {

	public static void main(String[] args) {
		int ar[]= {1,1,2,3,3,3,4,5,5,6};
		int i=0,j=1;
//		ArrayList<Integer> res=new ArrayList<>();
//		while(j<ar.length)
//		{
//			if(ar[i]!=ar[j]) {
//				res.add(ar[i]);
//				i=j;
//				
//			}
//			j++;
//		}
//		if(res.size()>0  && ar[ar.length-1]!=res.get(res.size()-1))
//			res.add(ar[ar.length-1]);
//		else {
//			res.add(ar[ar.length-1]);
//		}
//		System.out.println(res);
		while(j<ar.length)
		{
			if(ar[i]!=ar[j]) {
				i++;
				ar[i]=ar[j];
				
			}
			j++;
		}
	}

}
