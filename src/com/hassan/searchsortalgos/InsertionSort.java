package com.hassan.searchsortalgos;

/**
 * Created by Trikster on 6/30/2015.
 */
public class InsertionSort {

	public static void main (String[] args) {
		int[] arr1 = {};
		int[] arr2 = {1,2,3,4,5,6,7,8};
		int[] arr3 = {8,7,6,5,4,3,2,1};
		int[] arr4 = {1,7,3,5,4,4,2,6};
		int[] arr5 = {5,7,3,1,4,4,2,6};

		printArray( sort( arr1 ) );
		printArray( sort( arr2 ) );
		int[] sort = sort( arr3 );
//		System.out.println( "---------------------------------" );
		printArray( sort );
		printArray( sort( arr4 ) );
		printArray( sort( arr5 ) );
	}

	public static int[] sort (int[] array) {
		int[] result = array;
		int temp, j;
		for (int i = 1; i < result.length; i++) {
			temp = result[i];
			for (j = i - 1; j >= 0 && result[j] > temp; j--) {
				result[j + 1] = result[j];
			}
			result[j+1] = temp;
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
