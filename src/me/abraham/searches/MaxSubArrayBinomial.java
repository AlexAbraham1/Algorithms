package me.abraham.searches;

/**
 * Class MaxSubArrayBinomial - Given an array it will return an array {sum, lowerIndex, upperIndex} indicated
 * the maximum subarray in O(n^2) time
 *
 * @author Alex Abraham
 *
 * @version 12.22.2014
 */

public class MaxSubArrayBinomial {
	
	public static Object[] getValues(int[] array)
	{
		int sum = array[0];
		int lowIndex = 0;
		int highIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			int current = 0;
			for (int j = i; j < array.length; j++) {
				current += array[j];
				
				if (current > sum) {
					sum = current;
					lowIndex = i;
					highIndex = j;
				}
			}
		}
		
		Object[] result = {sum, lowIndex, highIndex};
		return result;
	}
	
	public static Object[] getValues(float[] array)
	{
		float sum = array[0];
		int lowIndex = 0;
		int highIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			float current = 0;
			for (int j = i; j < array.length; j++) {
				current += array[j];
				
				if (current > sum) {
					sum = current;
					lowIndex = i;
					highIndex = j;
				}
			}
		}
		
		Object[] result = {sum, lowIndex, highIndex};
		return result;
	}
	
	public static Object[] getValues(long[] array)
	{
		long sum = array[0];
		int lowIndex = 0;
		int highIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			long current = 0;
			for (int j = i; j < array.length; j++) {
				current += array[j];
				
				if (current > sum) {
					sum = current;
					lowIndex = i;
					highIndex = j;
				}
			}
		}
		
		Object[] result = {sum, lowIndex, highIndex};
		return result;
	}
	
	public static Object[] getValues(double[] array)
	{
		double sum = array[0];
		int lowIndex = 0;
		int highIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			double current = 0;
			for (int j = i; j < array.length; j++) {
				current += array[j];
				
				if (current > sum) {
					sum = current;
					lowIndex = i;
					highIndex = j;
				}
			}
		}
		
		Object[] result = {sum, lowIndex, highIndex};
		return result;
	}

}
