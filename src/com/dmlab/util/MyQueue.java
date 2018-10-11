package com.dmlab.util;

import com.dmlab.interfaces.Queue;

/**
 * Array-based Queue
 * The size of the internal array should be 128
 */
public class MyQueue<E> implements Queue<E>{
	
	public MyQueue() {
		
	}

	@Override
	public void clear() {
		
	}

	@Override
	public void add(E item) throws RuntimeException {
		
	}

	@Override
	public E poll() throws EmptyQueueException {
		return null;
	}

	@Override
	public E peek() throws EmptyQueueException {
		return null;
	}

	@Override
	public boolean empty() {
		return true;
	}

}
