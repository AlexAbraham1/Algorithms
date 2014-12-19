package me.abraham.datastructures;

/**
 * Class Stack - A class which resembles a standard stack.
 * 
 * This class is generic even though technically it doesn't have to be since there are no comparisons.
 *
 * @author Alex Abraham
 *
 * @version 12.15.2014
 */

public class Stack <E extends Comparable<E>> 
{
	
	@SuppressWarnings("rawtypes")
	private Comparable[] stack;
	
	private int size;
	
	public Stack()
	{
		stack = new Comparable[2];
		size = 0;
	}
	
	public boolean empty()
	{
		return size == 0;
	}
	
	@SuppressWarnings("unchecked")
	public E peek()
	{
		if (empty()) throw new EmptyStackException();
		return (E) stack[0];
	}
	
	public void push(E data)
	{
		if (size >= stack.length) expandStack();
		
		for (int i = size-1; i >= 0; i--) {
			stack[i+1] = stack[i];
		}
		
		stack[0] = data;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public E pop()
	{
		if (empty()) throw new EmptyStackException();
		
		E data = (E) stack[0];
		
		for (int i = 1; i < size; i++) {
			stack[i-1] = stack[i];
		}
		stack[size-1] = null;
		size--;
		
		return data;
	}
	
	@SuppressWarnings("rawtypes")
	private void expandStack()
	{
		int newLength = (int) ((float)1.5*stack.length);
		Comparable[] temp = new Comparable[newLength];
		
		for (int i = 0; i < stack.length; i++) {
			temp[i] = stack[i];
		}
		
		stack = temp;
	}
	
	public static class EmptyStackException extends RuntimeException {}

}
