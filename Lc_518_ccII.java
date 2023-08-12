package com.Arrays;

import java.util.Arrays;

public class Lc_518_ccII {
	static int x=0;
	public static void main(String[] args) {
		int amount = 5, coins[] = {1,2,3};
		int c=0;
		int dp[][]=new int[coins.length+1][amount+1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		x=helper(coins, coins.length,amount,dp);
		System.out.println(x);
	}

	private static int helper(int[] coins, int index,int amount, int[][] dp) {
		if (amount == 0) {// if amount is 0
			return 1;
		}
		if (index == 0) {// if there is no coin 
			return 0;
		}
		if (dp[index][amount] != -1) {
			return dp[index][amount];
		}
		if (amount < coins[index - 1]) {
			int exclude = helper(coins, index - 1, amount, dp);
			dp[index][amount] = exclude;
		} else {
			int exclude = helper(coins, index - 1, amount, dp);
			int include = helper(coins, index, amount - coins[index - 1], dp);
			dp[index][amount] = exclude + include;
		}
		return dp[index][amount];
	}
}
