package com.dmlab.util;

import java.util.EmptyStackException;

import com.dmlab.interfaces.Stack;

/**
 * Array-based Stack
 * The size of the internal array should be 128
 */
public class MyStack<E> implements Stack<E> {
	
	public MyStack() {
		
	}

	@Override
	public void clear() {
		
	}

	@Override
	public void push(E item) throws RuntimeException {
		
	}

	@Override
	public E pop() throws EmptyStackException {
		return null;
	}

	@Override
	public E peek() throws EmptyStackException {
		return null;
	}

	@Override
	public boolean empty() {
		return false;
	}

}
