package me.abraham.datastructures;

/**
 * Class ArrayList - A class which resembles a standard ArrayList
 *
 * @author Alex Abraham
 *
 * @version 12.14.2014
 */

public class ArrayList<T extends Comparable<T>> {
	
	@SuppressWarnings("rawtypes")
	private Comparable[] array;
	
	private int size;
	
	public <T extends Comparable> ArrayList()
	{
		array = new Comparable[2];
		size = 0;
	}
	
	public void add(T data)
	{
		if (size <= array.length) expandArray();
		array[size] = data;
		size++;
	}
	
	public void add(int index, T data)
	{
		if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
		
		if (size+1 <= array.length) expandArray();
		shiftItemsRight(index);
		array[index] = data;
		size++;
	}
	
	public void clear()
	{
		array = new Comparable[2];
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public boolean contains(T data)
	{
		for (int i = 0; i < size; i++) {
			if (((Comparable<T>) array[i]).compareTo(data) == 0) return true;
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index)
	{
		if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
		
		return (T) array[index];
	}
	
	@SuppressWarnings("unchecked")
	public int indexOf(T data)
	{
		for (int i = 0; i < size; i++) {
			if (((Comparable<T>) array[i]).compareTo(data) == 0) return i;
		}
		return -1;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public void remove(int index) {
		if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
		shiftItemsLeft(index+1);
	}
	
	public void remove(T data)
	{
		int index = indexOf(data);
		if (index != -1) shiftItemsLeft(index+1);
		else throw new ItemNotFoundException();
	}
	
	public void set(int index, T data)
	{
		if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
		
		array[index] = data;
	}
	
	public int size()
	{
		return size;
	}
	
	@SuppressWarnings("rawtypes")
	private void expandArray()
	{
		int newSize = (int) ((float) 1.5*array.length);
		Comparable[] temp = new Comparable[newSize];
		
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}
	
	private void shiftItemsRight(int index)
	{
		for (int i = size-1; i >= index; i--) {
			array[i+1] = array[i];
		}
	}
	
	private void shiftItemsLeft(int index)
	{
		for (int i = index; i < size; i++) {
			array[i-1] = array[i];
		}
		array[size-1] = null;
		size--;
	}
	
	@Override
	public String toString()
	{
		if (isEmpty()) return "[]";
		
		String str = "[";
		
		for (int i = 0; i < size-1; i++) {
			str += array[i] + ", ";
		}
		
		str += array[size-1] + "]";
		
		return str;
	}
	
	public static class ItemNotFoundException extends RuntimeException {}

}
