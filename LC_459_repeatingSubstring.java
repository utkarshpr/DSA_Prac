package com.Arrays;

public class LC_459_repeatingSubstring {

	public static void main(String[] args) {
		String x="abaababaab";
		//if(x.length()==0 || x.length()==1) // false
		System.out.println(helper(""+x.charAt(0),x,1));

	}

	private static boolean helper(String rep, String s, int inc) {
		if(rep.equals(s))
			return false;
		
		int i=0;
		while(i<s.length())
		{
			if(i+rep.length()<=s.length() && rep.equals(s.substring(i, i+rep.length()))) {
				i=i+rep.length();
			}
			else {
				return helper(s.substring(0, i+1),s,inc+1);
			}
		}
		return true;
		
	}

}
