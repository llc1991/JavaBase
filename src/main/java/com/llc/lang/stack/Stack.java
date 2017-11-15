package com.llc.lang.stack;

public interface Stack<T extends Object> {
	
	public void push(T element);
	public T pop();
	public boolean isEmpty();
	public int size();
}
