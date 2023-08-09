package com.Arrays;

import java.util.*;

public class LC_139_wordBreak {

	static HashMap<String, Boolean> dp;

	public static void main(String[] args) {
		String s = "dogs";
		ArrayList<String> wordDict = new ArrayList<>(Arrays.asList(new String[] { "dog", "s", "gs" }));
		HashSet<String> se = new HashSet<>(wordDict);

		boolean result = false;
		dp = new HashMap<String, Boolean>();
		System.out.println(helper(s, se));
	}

	private static boolean helper(String s, HashSet<String> se) {
		if (s.length() == 0) {
			return true;
		}
		if (dp.containsKey(s)) {
			return dp.get(s);
		}
		for(int i=0;i<s.length();i++)
		{
			String st=s.substring(0,i+1);
			if(se.contains(st))
			{
				if(helper(s.substring(i+1), se)) {
					dp.put(s, true);
					return true;
				}
			}
		}
		dp.put(s, false);
		return false;

	}

}
