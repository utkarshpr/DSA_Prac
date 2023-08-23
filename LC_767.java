package com.Arrays;

import java.util.*;

public class LC_767 {
	/*
	 * Start placing the most frequent characters first. Place them at even indices (0, 2, 4, ...).
Next, place the remaining characters at the odd indices (1, 3, 5, ...).
During this process, if the most frequent character appears more than (length of string+1)/2(\text{length of string} + 1) / 2(length of string+1)/2 times, return an empty string as reorganization is not possible.
	 */
	public static String main(String s) {
		HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        maxHeap.addAll(freqMap.keySet());

        if (freqMap.get(maxHeap.peek()) > (s.length() + 1) / 2) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        char[] result = new char[s.length()];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            for (int j = 0; j < freqMap.get(c); j++) {
                if (i >= s.length()) i = 1;
                result[i] = c;
                i += 2;
            }
        }

        return new String(result);
	}
}
