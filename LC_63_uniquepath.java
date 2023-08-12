package com.Arrays;

import java.util.Arrays;

public class LC_63_uniquepath {

	public static void main(String[] args) {
		int ar[][] = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		boolean visi[][] = new boolean[ar.length][ar[0].length];
		for (int i = 0; i < visi.length; i++)
			Arrays.fill(visi[i], false);
		System.out.println(helper(0, 0, visi, ar));
	}

	private static int helper(int i, int j, boolean[][] visi, int[][] ar) {
		if (i == ar.length - 1 && j == ar[0].length - 1) {
			return 1;
		}
		if (i < 0 || j < 0 || i >= ar.length || j >= ar[0].length || visi[i][j] == true || ar[i][j] == 1) {

			return 0;
		}
		visi[i][j] = true;
		int l = helper(i + 1, j, visi, ar);
		int r = helper(i, j + 1, visi, ar);
		visi[i][j] = false;
		return l + r;
	}

}
