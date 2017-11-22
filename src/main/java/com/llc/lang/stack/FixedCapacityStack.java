package com.llc.lang.stack;

public class FixedCapacityStack<Item> implements Stack<Item>{
	private Item [] a;
	private int index;
	public FixedCapacityStack(int cap) {
		 a= (Item[]) new Object[cap];
		 index = 0;
	}
	
	public void push(Item element) {
	  a[index++]=element;
	}

	public Item pop() {
		return a[--index];
	}

	public boolean isEmpty() {
		return index==0;
	}

	public int size() {
		return index;
	}

}
