package me.abraham.sorts.linear;

/**
 * Class CountingSort - A class Which sorts an integer array with a range of
 * numbers from 0 to K in linear time using CountingSort.
 *
 * @author Alex Abraham
 *
 * @version 12.13.2014
 */

public class CountingSort {
	
	public static void sort(int[] array, int max)
	{
		int[] countArray = new int[max+1];
		int[] resultArray = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			countArray[array[i]]++;
		}
		
		for (int i = 1; i < countArray.length; i++) {
			countArray[i] += countArray[i-1];
		}
		
		for (int i = array.length-1; i >= 0; i--) {
			resultArray[countArray[array[i]]-1] = array[i];
			countArray[array[i]]--;
		}
		
		for (int i = 0; i < resultArray.length; i++) {
			array[i] = resultArray[i];
		}
	}

}
