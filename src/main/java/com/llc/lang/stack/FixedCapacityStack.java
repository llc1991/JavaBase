package com.llc.lang.stack;

public class FixedCapacityStack<Item> implements Stack<Item> {
	private Item[] a;
	private int index;

	public void resize(int max){
	    Item [] temp =(Item[]) new Object[max];
		for (int i = 0; i < index; i++) {
			temp[i]=a[i];
		}
		a = temp;
	}
	
	public FixedCapacityStack(int cap) {
		a = (Item[]) new Object[cap];
		index = 0;
	}

	public void push(Item element) {
		if(index==a.length) resize(2*a.length);
		a[index++] = element;
		
	}

	public Item pop() {
		Item item = a[--index];
		if(index<a.length/4) resize(a.length/2);
		return item;
	}

	public boolean isEmpty() {
		return index == 0;
	}

	public int size() {
		return index;
	}

}
