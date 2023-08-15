package com.Arrays;

import java.util.*;

public class Lc_77_combinaion {

	public static void main(String[] args) {
		System.out.println(combine(4, 2));
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> ls = new ArrayList<>();
		List<Integer> ar = new ArrayList<>();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = i + 1;
		helper(a, ls, ar, k, 0);
		return ls;

	}

	private static void helper(int[] a, List<List<Integer>> ls, List<Integer> ar, int k, int i) {
		if (i == a.length) {
			if (ar.size() == k) {
				ls.add(new ArrayList<>(ar));

			}
			return;
		}
		if (ar.size() == k) {
			ls.add(new ArrayList<>(ar));
			return;
		}
		ar.add(a[i]);
		helper(a, ls, ar, k, i + 1);
		ar.remove(ar.size() - 1);
		helper(a, ls, ar, k, i + 1);

	}

}
