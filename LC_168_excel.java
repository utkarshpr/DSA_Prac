package com.Arrays;

public class LC_168_excel {
 public static void main(String[] args) {
	int n=701;
	System.out.println((String)helper(n));
}

private static String helper(int n) {
	if(n==0)
		return "";
	return helper(--n/26)+(char)('A'+n%26)+"";

}
	
}
