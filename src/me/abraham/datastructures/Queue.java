package me.abraham.datastructures;

/**
 * Class Queue - A class which resembles a standard queue
 * 
 * This class is generic even though technically it doesn't have to be since there are no comparisons.
 *
 * @author Alex Abraham
 *
 * @version 12.15.2014
 */

public class Queue <E>
{
	
	private Object[] queue;
	private int head;
	private int tail;
	
	public Queue()
	{
		queue = new Comparable[5];
	}
	
	public void enqueue(E data)
	{
		if (queue[tail] != null) expandQueue();
		
		queue[tail] = data;
		tail++;
		tail = tail % queue.length;
	}
	
	@SuppressWarnings("unchecked")
	public E dequeue()
	{
		if (empty()) throw new EmptyQueueException();
		
		E data = (E) queue[head];
		queue[head] = null;
		head++;
		head = head % queue.length;
		
		return data;
	}
	
	@SuppressWarnings("unchecked")
	public E peek()
	{
		if (empty()) throw new EmptyQueueException();
		
		return (E) queue[head];
	}
	
	public boolean empty()
	{
		return head == tail && queue[tail] == null;
	}
	
	private void expandQueue()
	{
		int newLength = (int) ((float) 1.5*queue.length);
		Object[] temp = new Comparable[newLength];
		
		int index = 0;
		while(!empty()) {
			temp[index] = dequeue();
			index++;
		}
		
		tail = queue.length;
		queue = temp;
		head = 0;
	}
	
	
	public static class EmptyQueueException extends RuntimeException {}
}
