package com.Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class A2_secondLargets{

	public static void main(String[] args) {
		int arr1[] = {1, 2, 6, 4, 5, 3 };
		seconDLargest(arr1);

	}

	private static void seconDLargest(int[] arr) {
		
		PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)->b-a);
		int n = arr.length  ;

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i])  ;
        }
        System.out.println(pq);
        int i=1;
        while(!pq.isEmpty())
        {
        	System.out.println(i++ +" largest "+pq.poll());
        }
        //System.out.println("Kth Smallest element "+pq.peek()) ;
       // System.out.println(pq);
		//System.out.println(pq.stream().toList().get(2));
		
	}
}


