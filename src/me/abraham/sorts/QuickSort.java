package me.abraham.sorts;

import java.util.Random;

/**
 * Class QuickSort - A class with a bunch of static methods to sort an array using QuickSort.
 * 
 * The QuickSort is randomized to minimize worst case.
 *
 * @author Alex Abraham
 *
 * @version 12.13.2014
 */

public class QuickSort {
	
	//SORT METHODS
	
	public static void sort(int[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	private static void sort(int[] array, int low, int high)
	{
		if (low < high) {
			
			//Swap Pivot
			Random r = new Random();
			int temp = r.nextInt(high-low+1) + low;
			swap(array, high, temp);
			
			//Sort Array
			
				
			int wall = low-1;
			int pivot = high;
			int currentIndex = low;
			
			int pivotElement = array[pivot];
			
			while (currentIndex < pivot) {
				if (array[currentIndex] < pivotElement) {
					wall++;
					swap(array, wall, currentIndex);
				}
				currentIndex++;
			}
			
			//At this point everything up to the wall is < pivot
			//and everything after the wall is => pivot
			wall++;
			swap(array, wall, pivot);
			
			//call sort before pivot and after pivot
			sort(array, low, wall-1);
			sort(array, wall+1, high);
			
		}
	}
	
	public static void sort(float[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	private static void sort(float[] array, int low, int high)
	{
		if (low < high) {
			
			//Swap Pivot
			Random r = new Random();
			int temp = r.nextInt(high-low+1) + low;
			swap(array, high, temp);
			
			//Sort Array
			if (low < high) {
				
				int wall = low-1;
				int pivot = high;
				int currentIndex = low;
				
				float pivotElement = array[pivot];
				
				while (currentIndex < pivot) {
					if (array[currentIndex] < pivotElement) {
						wall++;
						swap(array, wall, currentIndex);
					}
					currentIndex++;
				}
				
				//At this point everything up to the wall is < pivot
				//and everything after the wall is => pivot
				wall++;
				swap(array, wall, pivot);
				
				//call sort before pivot and after pivot
				sort(array, low, wall-1);
				sort(array, wall+1, high);
			}
			
			
		}
	}
	
	public static void sort(long[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	private static void sort(long[] array, int low, int high)
	{
		if (low < high) {
			
			//Swap Pivot
			Random r = new Random();
			int temp = r.nextInt(high-low+1) + low;
			swap(array, high, temp);
			
			//Sort Array
			if (low < high) {
				
				int wall = low-1;
				int pivot = high;
				int currentIndex = low;
				
				long pivotElement = array[pivot];
				
				while (currentIndex < pivot) {
					if (array[currentIndex] < pivotElement) {
						wall++;
						swap(array, wall, currentIndex);
					}
					currentIndex++;
				}
				
				//At this point everything up to the wall is < pivot
				//and everything after the wall is => pivot
				wall++;
				swap(array, wall, pivot);
				
				//call sort before pivot and after pivot
				sort(array, low, wall-1);
				sort(array, wall+1, high);
			}
			
			
		}
	}
	
	public static void sort(double[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	private static void sort(double[] array, int low, int high)
	{
		if (low < high) {
			
			//Swap Pivot
			Random r = new Random();
			int temp = r.nextInt(high-low+1) + low;
			swap(array, high, temp);
			
			//Sort Array
			if (low < high) {
				
				int wall = low-1;
				int pivot = high;
				int currentIndex = low;
				
				double pivotElement = array[pivot];
				
				while (currentIndex < pivot) {
					if (array[currentIndex] < pivotElement) {
						wall++;
						swap(array, wall, currentIndex);
					}
					currentIndex++;
				}
				
				//At this point everything up to the wall is < pivot
				//and everything after the wall is => pivot
				wall++;
				swap(array, wall, pivot);
				
				//call sort before pivot and after pivot
				sort(array, low, wall-1);
				sort(array, wall+1, high);
			}
			
			
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void sort(Comparable[] array, int low, int high)
	{
		if (low < high) {
			
			//Swap Pivot
			Random r = new Random();
			int temp = r.nextInt(high-low+1) + low;
			swap(array, high, temp);
			
			//Sort Array
			if (low < high) {
				
				int wall = low-1;
				int pivot = high;
				int currentIndex = low;
				
				Comparable pivotElement = array[pivot];
				
				while (currentIndex < pivot) {
					if (array[currentIndex].compareTo(pivotElement) < 0) {
						wall++;
						swap(array, wall, currentIndex);
					}
					currentIndex++;
				}
				
				//At this point everything up to the wall is < pivot
				//and everything after the wall is => pivot
				wall++;
				swap(array, wall, pivot);
				
				//call sort before pivot and after pivot
				sort(array, low, wall-1);
				sort(array, wall+1, high);
			}
			
			
		}
	}
	
	//SWAP METHODS
	
	private static void swap(int[] array, int a, int b)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	private static void swap(float[] array, int a, int b)
	{
		float temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	private static void swap(long[] array, int a, int b)
	{
		long temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	private static void swap(double[] array, int a, int b)
	{
		double temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	@SuppressWarnings("rawtypes")
	private static void swap(Comparable[] array, int a, int b)
	{
		Comparable temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

}
