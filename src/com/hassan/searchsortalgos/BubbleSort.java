package com.hassan.searchsortalgos;

/**
 * Created by Trikster on 6/30/2015.
 */
public class BubbleSort {


	public static void main (String[] args) {
		int[] arr1 = {};
		int[] arr2 = {1,2,3,4,5,6,7,8};
		int[] arr3 = {8,7,6,5,4,3,2,1};
		int[] arr4 = {1,7,3,5,4,4,2,6};

		printArray( sort( arr1 ) );
		printArray( sort( arr2 ) );
		printArray( sort( arr3 ) );
		printArray( sort( arr4 ) );
	}

	public static int[] sort (int[] array) {
		int[] result = array;
		int temp = 0;
		for (int i = 0; i < result.length - 1; i++) {
			for (int j = 0; j < result.length - i - 1; j++) {
				if (result[j] > result[j + 1]) {
					temp = result[j];
					result[j] = result[j + 1];
					result[j + 1] = temp;
				}
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
