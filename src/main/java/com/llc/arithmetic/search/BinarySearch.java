package com.llc.arithmetic.search;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 6, 7, 8 };
		int toFind = 5;
		int findIndex = -1;

		int low = a[0];
		int high = a[a.length - 1];

		while ((high != a.length - 1 || low != 0)) {
			int mid = (high - low) / 2;
			if (toFind < a[mid]) {
				high = mid;
			} else if (toFind > a[mid]) {
				low = mid;
			} else {
				findIndex = mid;
			}
		}
		System.out.println(findIndex);
	}
}
