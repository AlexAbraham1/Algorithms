package me.abraham.sorts.linear;

import me.abraham.datastructures.LinkedList;
import me.abraham.sorts.InsertionSort;

/**
 * Class BucketSort - A class Which sorts a float array in linear time using BucketSort.
 * 
 * Array is assumed to have uniform distribution
 *
 * @author Alex Abraham
 *
 * @version 12.15.2014
 */

public class BucketSort {
	
	@SuppressWarnings("unchecked")
	public static void sort(float[] array)
	{
		LinkedList<Float>[] buckets = new LinkedList[array.length];
		
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<Float>();
		}
		
		for (int i = 0; i < array.length; i++) {
			buckets[(int) ((float) (array.length*array[i]))].add(array[i]);
		}
		
		int currentIndex = 0;
		for (int i = 0; i < buckets.length; i++) {
			LinkedList<Float> bucket = buckets[i];
			InsertionSort.sort(bucket);
			
			for (int j = 0; j < bucket.size(); j++) {
				array[currentIndex] = bucket.get(j);
				currentIndex++;
			}
		}
	}

}
