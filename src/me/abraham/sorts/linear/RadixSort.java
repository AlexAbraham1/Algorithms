package me.abraham.sorts.linear;

/**
 * Class RadixSort - A class Which sorts integers and strings in linear time using RadixSort
 * 
 * INTEGERS: Assumed that all integers in the array have the same amount of digits
 * 
 * STRINGS: Allowed to be different sizes but a maximum has to be determined. Sort is faster if max
 * is given as a parameter but if not then the sort will loop through the array once to find the max.
 *
 * @author Alex Abraham
 *
 * @version 12.14.2014
 */

public class RadixSort {
	
	//INTEGERS
	
	/*
	 * This method assumes that all integers in the array have the same amount of digits
	 */
	public static void sort(int[] array)
	{
		int length = ("" + array[0]).length();
		int divisor = 1;
		
		int[] temp = sort(array, length, divisor);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = temp[i];
		}
	}
	
	private static int[] sort(int[] array, int charLength, int divisor)
	{
		int[] counterArray = new int[10];
		int[] tempArray = new int[array.length];
		
		if (charLength > 0) {
			
			for (int i = 0; i < array.length; i++) {
				counterArray[(array[i]/divisor)%10]++;
			}
			
			for (int i = 1; i < counterArray.length; i++) {
				counterArray[i] += counterArray[i-1];
			}
			
			for (int i = array.length - 1; i >= 0; i--) {
				tempArray[counterArray[(array[i]/divisor)%10]-1] = array[i];
				counterArray[(array[i]/divisor) % 10]--;
			}
			
			for (int i = 0; i < array.length; i++) {
				array[i] = tempArray[i];
			}
			
			return sort(array, charLength-1, divisor*10);
		} else {
			return array;
		}
	}
	
	//STRINGS
	
	/*
	 * This method is slower because it forst loops through the array once
	 * to find the maxWordSize
	 */
	public static void sort(String[] array)
	{
		int maxWordSize = 0;
		int length;
		
		for (int i = 0; i < array.length; i++) {
			if ((length = array[i].length()) > maxWordSize) maxWordSize = length;
		}
		
		sort(array, maxWordSize);
	}
	
	/*
	 * This method will use radix sort on strings. They do not have to be the same length 
	 * but the method does require a maxWordSize
	 */
	public static void sort(String[] array, int maxWordSize)
	{
		String[] temp = sortArray(array, maxWordSize);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = temp[i];
		}
	}
	
	private static String[] sortArray(String[] array, int index)
	{
		index -= 1;
		if (index >= 0) {
			
			String[] result = new String[array.length];
			
			char[] counter = new char[65536];
			
			for (int i = 0; i < array.length; i++) {
				counter[getCharIndex(array[i], index)]++;
			}
			
			for (int i = 1; i < counter.length; i++) {
				counter[i] += counter[i-1];
			}
			
			for (int i = array.length-1; i >= 0; i--) {
				result[counter[getCharIndex(array[i], index)]-1] = array[i];
				counter[getCharIndex(array[i], index)]--;
			}
			
			return sortArray(result, index);
			
		} else {
			return array;
		}
	}
	
	private static int getCharIndex(String str, int index)
	{
		if (str.length() > index) {
			return str.charAt(index);
		} else {
			return 0;
		}
	}

}
