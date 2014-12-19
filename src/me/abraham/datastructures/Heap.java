package me.abraham.datastructures;

@SuppressWarnings({"rawtypes", "unchecked"})
abstract public class Heap<E extends Comparable<E>> {
	
	
	protected Comparable[] array;	
	protected int heapSize;
	
	abstract public void heapify(int i);
	
	public Heap()
	{
		this.array = null;
		this.heapSize = 0;
	}
	
	public Heap(Comparable[] array) {
		this.array = array;
		this.heapSize = 0;
		buildHeap();
	}
	
	/*
	 * Heapify array from the bottom up
	 */
	public void buildHeap()
	{
		for (int i = array.length/2; i >= 0; i--) {
			heapify(i);
		}
	}
	
	/*
	 * Swap the elements at two indecies
	 */
	protected void swap(int i, int j) {
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	/*
	 * Calculates the index of a parent based on the child index
	 */
	public static final int parent(int i) {
		return (i-1)/2;
	}
	
	/*
	 * Calculate the index of the left child from the parent index
	 */
	public static final int left(int i) {
		return (i*2) + 1;
	}
	
	/*
	 * Calculate the index of the right child from the parent index
	 */
	public static final int right(int i) {
		return (i*2) + 2;
	}
	
	public boolean isEmpty()
	{
		return heapSize == 0;
	}
	
	/*
	 * Returns the head of the tree without removing it
	 */
	public E head()
	{
		return (E) array[0];
	}
	
	public void sort()
	{
		
	}
	
	
}
