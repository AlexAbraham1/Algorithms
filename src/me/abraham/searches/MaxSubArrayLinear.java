package me.abraham.searches;

/**
 * Class MaxSubArrayLinear - Given an array it will return an array {sum, lowerIndex, upperIndex} indicated
 * the maximum subarray in O(n) time
 *
 * @author Alex Abraham
 *
 * @version 12.22.2014
 */

public class MaxSubArrayLinear {
	
	public static Object[] getValues(int[] array)
	{
		//Initialize Containers
		IntContainer maxCurrent = new IntContainer(array);
		IntContainer maxTotal = new IntContainer(array);
		
		for (int i = 1; i < array.length; i++) {
			
			int value = array[i];
			
			//Set the maxCurrent
			if (maxCurrent.sum < 0) {
				maxCurrent.sum = value;
				maxCurrent.indecies[0] = i;
				maxCurrent.indecies[1] = i;
			} else {
				maxCurrent.sum += value;
				maxCurrent.indecies[1] = i;
			}
			
			//Compare with maxTotal
			if (maxCurrent.sum >= maxTotal.sum) {
				maxTotal.sum = maxCurrent.sum;
				maxTotal.indecies = maxCurrent.indecies;
			}
		}
		
		Object[] result = {maxTotal.sum, maxTotal.indecies[0], maxTotal.indecies[1]};
		return result;
	}
	
	public static Object[] getValues(float[] array)
	{
		//Initialize Containers
		FloatContainer maxCurrent = new FloatContainer(array);
		FloatContainer maxTotal = new FloatContainer(array);
		
		for (int i = 1; i < array.length; i++) {
			
			float value = array[i];
			
			//Set the maxCurrent
			if (maxCurrent.sum < 0) {
				maxCurrent.sum = value;
				maxCurrent.indecies[0] = i;
				maxCurrent.indecies[1] = i;
			} else {
				maxCurrent.sum += value;
				maxCurrent.indecies[1] = i;
			}
			
			//Compare with maxTotal
			if (maxCurrent.sum >= maxTotal.sum) {
				maxTotal.sum = maxCurrent.sum;
				maxTotal.indecies = maxCurrent.indecies;
			}
		}
		
		Object[] result = {maxTotal.sum, maxTotal.indecies[0], maxTotal.indecies[1]};
		return result;
	}
	
	public static Object[] getValues(long[] array)
	{
		//Initialize Containers
		LongContainer maxCurrent = new LongContainer(array);
		LongContainer maxTotal = new LongContainer(array);
		
		for (int i = 1; i < array.length; i++) {
			
			long value = array[i];
			
			//Set the maxCurrent
			if (maxCurrent.sum < 0) {
				maxCurrent.sum = value;
				maxCurrent.indecies[0] = i;
				maxCurrent.indecies[1] = i;
			} else {
				maxCurrent.sum += value;
				maxCurrent.indecies[1] = i;
			}
			
			//Compare with maxTotal
			if (maxCurrent.sum >= maxTotal.sum) {
				maxTotal.sum = maxCurrent.sum;
				maxTotal.indecies = maxCurrent.indecies;
			}
		}
		
		Object[] result = {maxTotal.sum, maxTotal.indecies[0], maxTotal.indecies[1]};
		return result;
	}
	
	public static Object[] getValues(double[] array)
	{
		//Initialize Containers
		DoubleContainer maxCurrent = new DoubleContainer(array);
		DoubleContainer maxTotal = new DoubleContainer(array);
		
		for (int i = 1; i < array.length; i++) {
			
			double value = array[i];
			
			//Set the maxCurrent
			if (maxCurrent.sum < 0) {
				maxCurrent.sum = value;
				maxCurrent.indecies[0] = i;
				maxCurrent.indecies[1] = i;
			} else {
				maxCurrent.sum += value;
				maxCurrent.indecies[1] = i;
			}
			
			//Compare with maxTotal
			if (maxCurrent.sum >= maxTotal.sum) {
				maxTotal.sum = maxCurrent.sum;
				maxTotal.indecies = maxCurrent.indecies;
			}
		}
		
		Object[] result = {maxTotal.sum, maxTotal.indecies[0], maxTotal.indecies[1]};
		return result;
	}
	
	static class IntContainer {
		int sum;
		int[] indecies = {0,0}; //Initial value at 0
		
		IntContainer(int[] array) {
			this.sum = array[0];
		}
	}
	
	static class FloatContainer {
		float sum;
		int[] indecies = {0,0}; //Initial value at 0
		
		FloatContainer(float[] array) {
			this.sum = array[0];
		}
	}
	
	static class LongContainer {
		long sum;
		int[] indecies = {0,0}; //Initial value at 0
		
		LongContainer(long[] array) {
			this.sum = array[0];
		}
	}
	
	static class DoubleContainer {
		double sum;
		int[] indecies = {0,0}; //Initial value at 0
		
		DoubleContainer(double[] array) {
			this.sum = array[0];
		}
	}

}
