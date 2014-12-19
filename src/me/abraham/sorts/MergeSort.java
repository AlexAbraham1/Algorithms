package me.abraham.sorts;

/**
 * Class MergeSort - A class with a bunch of static methods to sort an array using MergeSort.
 *
 * @author Alex Abraham
 *
 * @version 12.13.2014
 */

public class MergeSort {
	
	//SORT METHODS
	
	public static void sort(int[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	private static void sort(int[] array, int lowerIndex, int upperIndex)
	{
		if (lowerIndex < upperIndex) {
			int middleIndex = lowerIndex + (upperIndex - lowerIndex)/2;
			
			sort(array, lowerIndex, middleIndex);
			sort(array, middleIndex+1, upperIndex);
			
			merge(array, lowerIndex, middleIndex, upperIndex);
		}
	}
	
	public static void sort(float[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	private static void sort(float[] array, int lowerIndex, int upperIndex)
	{
		if (lowerIndex < upperIndex) {
			int middleIndex = lowerIndex + (upperIndex - lowerIndex)/2;
			
			sort(array, lowerIndex, middleIndex);
			sort(array, middleIndex+1, upperIndex);
			
			merge(array, lowerIndex, middleIndex, upperIndex);
		}
	}
	
	public static void sort(long[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	private static void sort(long[] array, int lowerIndex, int upperIndex)
	{
		if (lowerIndex < upperIndex) {
			int middleIndex = lowerIndex + (upperIndex - lowerIndex)/2;
			
			sort(array, lowerIndex, middleIndex);
			sort(array, middleIndex+1, upperIndex);
			
			merge(array, lowerIndex, middleIndex, upperIndex);
		}
	}
	
	public static void sort(double[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	private static void sort(double[] array, int lowerIndex, int upperIndex)
	{
		if (lowerIndex < upperIndex) {
			int middleIndex = lowerIndex + (upperIndex - lowerIndex)/2;
			
			sort(array, lowerIndex, middleIndex);
			sort(array, middleIndex+1, upperIndex);
			
			merge(array, lowerIndex, middleIndex, upperIndex);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] array)
	{
		sort(array, 0, array.length-1);
	}
	
	@SuppressWarnings("rawtypes")
	private static void sort(Comparable[] array, int lowerIndex, int upperIndex)
	{
		if (lowerIndex < upperIndex) {
			int middleIndex = lowerIndex + (upperIndex - lowerIndex)/2;
			
			sort(array, lowerIndex, middleIndex);
			sort(array, middleIndex+1, upperIndex);
			
			merge(array, lowerIndex, middleIndex, upperIndex);
		}
	}
	
	
	//MERGE METHODS
	
	private static void merge(int[] array, int lowerIndex, int middleIndex, int upperIndex)
	{
		//Coppy portion of array into auxilary array
		int[] auxArray = new int[upperIndex+1];
		for (int i = lowerIndex; i <= upperIndex; i++) {
			auxArray[i] = array[i];
		}
		
		//Create counters to keep track of indecies
		int i = lowerIndex;
		int j = middleIndex+1;
		int k = lowerIndex;
		
		//Put smaller items in front of array
		while (i <= middleIndex && j <= upperIndex) {		
			if (auxArray[i] <= auxArray[j]) {
				array[k] = auxArray[i];
				i++;
			} else {
				array[k] = auxArray[j];
				j++;
			}
			k++;
		}
		
		//Add any overwritten items to end of array
		while (i <= middleIndex) {
			array[k] = auxArray[i];
			i++;
			k++;
		}
	}
	
	private static void merge(long[] array, int lowerIndex, int middleIndex, int upperIndex)
	{
		//Coppy portion of array into auxilary array
		long[] auxArray = new long[upperIndex+1];
		for (int i = lowerIndex; i <= upperIndex; i++) {
			auxArray[i] = array[i];
		}
		
		//Create counters to keep track of indecies
		int i = lowerIndex;
		int j = middleIndex+1;
		int k = lowerIndex;
		
		//Put smaller items in front of array
		while (i <= middleIndex && j <= upperIndex) {		
			if (auxArray[i] <= auxArray[j]) {
				array[k] = auxArray[i];
				i++;
			} else {
				array[k] = auxArray[j];
				j++;
			}
			k++;
		}
		
		//Add any overwritten items to end of array
		while (i <= middleIndex) {
			array[k] = auxArray[i];
			i++;
			k++;
		}
	}
	
	private static void merge(float[] array, int lowerIndex, int middleIndex, int upperIndex)
	{
		//Coppy portion of array into auxilary array
		float[] auxArray = new float[upperIndex+1];
		for (int i = lowerIndex; i <= upperIndex; i++) {
			auxArray[i] = array[i];
		}
		
		//Create counters to keep track of indecies
		int i = lowerIndex;
		int j = middleIndex+1;
		int k = lowerIndex;
		
		//Put smaller items in front of array
		while (i <= middleIndex && j <= upperIndex) {		
			if (auxArray[i] <= auxArray[j]) {
				array[k] = auxArray[i];
				i++;
			} else {
				array[k] = auxArray[j];
				j++;
			}
			k++;
		}
		
		//Add any overwritten items to end of array
		while (i <= middleIndex) {
			array[k] = auxArray[i];
			i++;
			k++;
		}
	}
	
	private static void merge(double[] array, int lowerIndex, int middleIndex, int upperIndex)
	{
		//Coppy portion of array into auxilary array
		double[] auxArray = new double[upperIndex+1];
		for (int i = lowerIndex; i <= upperIndex; i++) {
			auxArray[i] = array[i];
		}
		
		//Create counters to keep track of indecies
		int i = lowerIndex;
		int j = middleIndex+1;
		int k = lowerIndex;
		
		//Put smaller items in front of array
		while (i <= middleIndex && j <= upperIndex) {		
			if (auxArray[i] <= auxArray[j]) {
				array[k] = auxArray[i];
				i++;
			} else {
				array[k] = auxArray[j];
				j++;
			}
			k++;
		}
		
		//Add any overwritten items to end of array
		while (i <= middleIndex) {
			array[k] = auxArray[i];
			i++;
			k++;
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void merge(Comparable[] array, int lowerIndex, int middleIndex, int upperIndex)
	{
		//Coppy portion of array into auxilary array
		Comparable[] auxArray = new Comparable[upperIndex+1];
		for (int i = lowerIndex; i <= upperIndex; i++) {
			auxArray[i] = array[i];
		}
		
		//Create counters to keep track of indecies
		int i = lowerIndex;
		int j = middleIndex+1;
		int k = lowerIndex;
		
		//Put smaller items in front of array
		while (i <= middleIndex && j <= upperIndex) {		
			if (auxArray[i].compareTo(auxArray[j]) <= 0) {
				array[k] = auxArray[i];
				i++;
			} else {
				array[k] = auxArray[j];
				j++;
			}
			k++;
		}
		
		//Add any overwritten items to end of array
		while (i <= middleIndex) {
			array[k] = auxArray[i];
			i++;
			k++;
		}
	}

}
