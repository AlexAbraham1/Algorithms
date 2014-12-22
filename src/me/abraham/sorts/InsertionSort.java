package me.abraham.sorts;

import me.abraham.datastructures.LinkedList;

/**
 * Class InsertionSort - A class with a bunch of static methods to sort an array or LinkedList using InsertionSort.
 *
 * @author Alex Abraham
 *
 * @version 12.13.2014
 */

public class InsertionSort {
	
	public static void sort(int[] array)
	{
		for (int i = 1; i < array.length; i++) {
			
			int key = array[i];
			int j = i;
			
			while(j > 0 && array[j-1] > key) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = key;
			
		}
	}
	
	public static void sort(float[] array)
	{
		for (int i = 1; i < array.length; i++) {
			
			float key = array[i];
			int j = i;
			
			while(j > 0 && array[j-1] > key) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = key;
			
		}		
	}
	
	public static void sort(long[] array)
	{
		for (int i = 1; i < array.length; i++) {
			
			long key = array[i];
			int j = i;
			
			while(j > 0 && array[j-1] > key) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = key;
			
		}		
	}
	
	public static void sort(double[] array)
	{
		for (int i = 1; i < array.length; i++) {
			
			double key = array[i];
			int j = i;
			
			while(j > 0 && array[j-1] > key) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = key;
			
		}		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable[] array)
	{
		for (int i = 1; i < array.length; i++) {
			
			Comparable key = array[i];
			int j = i;
			
			while(j > 0 && array[j-1].compareTo(key) > 0) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = key;
			
		}		
	}
	
	public static <T extends Comparable<T>> void sort(LinkedList<T> list) 
	{	
		for (int i = 1; i < list.size(); i++) {
			T value = list.get(i);
			int j = i-1;
			while (j >= 0 && list.get(j).compareTo(value) > 0) {
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, value);
		}
	}

}
