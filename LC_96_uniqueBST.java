package com.Arrays;

import java.util.ArrayList;

public class LC_96_uniqueBST {

	public static void main(String[] args) {
		int n = 3;
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = i + 1;
		}
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		helper(ar, res, 0);
		System.out.println(res);
	}

	private static void helper(int[] ar, ArrayList<ArrayList<Integer>> res, int i) {
		if (i == ar.length) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int num : ar) {
				temp.add(num);

			}
			Node re = constructBST(temp, res, 0, temp.size());
			System.out.println(re);

			return;
		}
		for (int j = i; j < ar.length; j++) {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;

			helper(ar, res, i + 1);

			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}

	}

	private static Node constructBST(ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res, int start, int end) {
		ArrayList<Node> trees = new ArrayList<>();
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;

		Node leftTrees = constructBST(temp, res, start, mid - 1);
		Node rightTrees = constructBST(temp, res, mid + 1, end);
		Node node = new Node(leftTrees, rightTrees, mid);
	
		return node;

	}

	

}
