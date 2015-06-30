package com.hassan.searchsortalgos;

/**
 * Created by Trikster on 6/30/2015.
 */
public class SelectionSort {

	public static void main (String[] args) {
		int[] arr1 = {};
		int[] arr2 = {1,2,3,4,5,6,7,8};
		int[] arr3 = {8,7,6,5,4,3,2,1};
		int[] arr4 = {1, 7, 3, 5, 4, 4, 2, 6};

		printArray( sort( arr1 ) );
		printArray( sort( arr2 ) );
		printArray( sort( arr3 ) );
		printArray( sort( arr4 ) );
	}

	public static int[] sort (int[] array) {
		int[] result = array;
		int smallest;
		for (int i = 0; i < result.length - 1; i++) {
			smallest = i;
			for (int j = i; j < result.length; j++) {
				if (result[smallest] > result[j]) {
					smallest = j;
				}
			}
			if (smallest != i) {
				int temp = result[i];
				result[i] = result[smallest];
				result[smallest] = temp;
			}
		}
		return result;
	}

	public static void printArray (int[] array) {
		for (int i : array) {
			System.out.print( i + "," );
		}
		System.out.print( "\n" );
	}
}
