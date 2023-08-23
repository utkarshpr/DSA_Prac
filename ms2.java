package com.Arrays;

import java.util.ArrayList;

public class ms2 {

	int dp[][];

	public static void main(String[] args) {
		int ar[] = { 10, 3, 4, 7 };
		int x = 2;
		int y = 3;
		int ans = sol(ar, ar.length, x, y);
		System.out.println(ans);
	}

	public static int sol(int ar[], int n, int x, int y) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length - y; i++) {
			int x1 = helper(ar, i, x, y, 0, -1);
			min = Math.min(min, x1);
		}
		return min;

	}

	private static int helper(int[] ar, int i, int x, int y, int value, int prev) {

		if (x == 0) {

			return value;

		}
		if (i >= ar.length) {

			return Integer.MAX_VALUE;
		}

		int xx = (helper(ar, i + y, x - 1, y, value + ar[i], i));
		return xx;

	}
}
