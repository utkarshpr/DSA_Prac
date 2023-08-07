package com.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s="cbacdcbc";
		int ar[]=new int [26];
		for(int i=0;i<s.length();i++)
			ar[s.charAt(i)-'a']=i;
		Stack<Integer> st=new Stack<>();
		boolean seen[]=new boolean[26];
		Arrays.fill(seen, false);
		for(int i=0;i<s.length();i++)
		{
			int curr=s.charAt(i)-'a';
			if(seen[curr])continue;
			
			while(!st.isEmpty() && st.peek()>curr && i<ar[st.peek()]) {
				
				seen[st.pop()]=false;
			}
			st.push(curr);
			seen[curr]=true;;
			
		}

		StringBuilder sb=new StringBuilder();
		while(!st.isEmpty()) {
			sb.append((char)(st.pop()+'a'));
		}
		System.out.println(sb.reverse().toString());
		
	}

}
