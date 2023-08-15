package com.Arrays;

import java.util.PriorityQueue;

public class LC_215_KTHLARGESTElement {
	public static void main(String[] args) {
		int nums[] = { 3,2,3,1,2,4,5,5,6 }, k = 4;
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for (int i = 0; i < nums.length; i++)
			pq.add(nums[i]);
		while(!pq.isEmpty() && k!=1) {
			pq.poll();
			k--;
		}
		System.out.println(pq.poll());
	}
}
