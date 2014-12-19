package me.abraham.datastructures;

/**
 * Class LinkedList - A class which resembles a standard LinkedList
 *
 * @author Alex Abraham
 *
 * @version 12.14.2014
 */

public class LinkedList<E extends Comparable<E>> 
{
	
	private Node first;
	private Node last;
	private int numberOfElements;
	
	public void add(E data)
	{
		if (isEmpty()) {
			Node node = new Node(data, null, null);
			first = node;
			last = node;
		} else {
			Node node = new Node(data, last, null);
			last.next = node;
			last = node;
		}
		numberOfElements++;
	}
	
	public void addFirst(E data)
	{
		if (isEmpty()) {
			Node node = new Node(data, null, null);
			first = node;
			last = node;
		} else {
			Node node = new Node(data, null, first);
			first.previous = node;
			first = node;
		}
		numberOfElements++;
	}
	
	public void clear()
	{
		Node node = first;
		while (node.next != null) {
			node = node.next;
			node.previous = null;
		}
		last = null;
		
		numberOfElements = 0;
	}
	
	public boolean contains(E data)
	{
		boolean halt = false;
		Node node = first;
		
		while (!halt && node != null) {
			if (node.data.equals(data)) {
				return true;
			}
			
			node = node.next;
		}
		
		return false;
	}
	
	public E getFirst()
	{
		return first.data;
	}
	
	public E getLast()
	{
		return last.data;
	}
	
	public E get(int index)
	{
		if (index < 0 || index >= numberOfElements) throw new IndexOutOfBoundsException();
		
		Node node = getNodeAtIndex(index);
		
		return node.data;
	}
	
	public int indexOf(E data)
	{	
		Node node = first;
		int index = 0;
		
		do {
			if (node.data == data) return index;
			node = node.next;
			index++;
		} while (index < numberOfElements);
		
		return -1;
	}
	
	public boolean isEmpty()
	{
		return numberOfElements == 0;
	}
	
	public E removeFirst()
	{
		if (numberOfElements == 0) throw new EmptyListException();
		
		E data = first.data;
		
		Node node = first.next;
		node.previous = null;
		first = node;
		numberOfElements--;
		
		return data;
	}
	
	public E removeLast()
	{
		if (numberOfElements == 0) throw new EmptyListException();
		
		E data = last.data;
		
		Node node = last.previous;
		node.next = null;
		last = node;
		numberOfElements--;
		
		return data;
	}
	
	public E remove(int index) {
		
		if (numberOfElements == 0) throw new EmptyListException();
		if (index < 0 || index >= numberOfElements) throw new IndexOutOfBoundsException();
		
		if (index == 0) return removeFirst();
		if (index == numberOfElements-1) return removeLast();
		
		Node node = getNodeAtIndex(index);
		
		E data = node.data;
		
		Node previous = node.previous;
		Node next = node.next;
		previous.next = next;
		next.previous = previous;
		node = null;
		numberOfElements--;
		
		return data;
	}
	
	public E set(int index, E data)
	{
		Node node = getNodeAtIndex(index);
		node.data = data;
		return data;
	}
	
	public int size()
	{
		return numberOfElements;
	}
	
	public void insertionSort()
	{
		if (numberOfElements > 1) {
			Node node = first.next;
			
			
		}
	}
	
	private Node getNodeAtIndex(int index)
	{
		if (index < 0 || index >= numberOfElements) throw new IndexOutOfBoundsException();
		
		int currentIndex = 0;
		Node node = first;
		
		while (currentIndex != index) {
			node = node.next;
			currentIndex++;
		}
		
		return node;
	}
	
	class Node
	{
		Node previous;
		Node next;
		E data;
		
		Node(E data, Node previous, Node next) {
			this.previous = previous;
			this.next = next;
			this.data = data;
		}
		
		@Override
		public String toString()
		{
			return this.data.toString();
		}
	}
	
	@Override
	public String toString()
	{
		if (isEmpty()) return "[]";
		
		String str = "[";
		
		Node node = first;
		
		while (node.next != null) {
			str += node.data + ", ";
			node = node.next;
		}
		
		str += last.data + "]";
		
		return str;
	}
	
	public static class EmptyListException extends RuntimeException {}
	
}
