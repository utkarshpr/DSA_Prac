package com.Arrays;

public class AE1_LargestElement {
	public static void main(String[] args) {

		int arr1[] = { 2, 5, 1, 3, 0 };
		System.out.println("The Largest element in the array is: " + findLargestElement(arr1));
	}

	static int findLargestElement(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}
}
