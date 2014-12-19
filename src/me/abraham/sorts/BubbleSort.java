package me.abraham.sorts;

/**
 * Class BubbleSort - A class with a bunch of static methods to sort an array using BubbleSort.
 *
 * @author Alex Abraham
 *
 * @version 12.13.2014
 */

public class BubbleSort {
	
	public static void sort(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				
				if (array[j] > array[j+1]) {
					
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					
				}
				
			}
		}
	}
	
	public static void sort(float[] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				
				if (array[j] > array[j+1]) {
					
					float temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					
				}
				
			}
		}
	}
	
	public static void sort(long[] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				
				if (array[j] > array[j+1]) {
					
					long temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					
				}
				
			}
		}
	}
	
	public static void sort(double[] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				
				if (array[j] > array[j+1]) {
					
					double temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					
				}
				
			}
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable[] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				
				if (array[j].compareTo(array[j+1]) > 0) {
					
					Comparable temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					
				}
				
			}
		}
	}

}
