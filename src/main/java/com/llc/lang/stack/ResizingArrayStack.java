package com.llc.lang.stack;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Stack<Item>,Iterable<Item>{
    private Item[] a;
    private int index;
	
    public void resize(int size){
    	Item[] tmp = (Item[]) new Object[size];
    	for (int i = 0; i < index; i++) {
			tmp[i]=a[i];
		}
    	a = tmp;
    }
    
    public ResizingArrayStack(){
    	a =(Item[]) new Object [1];
    	index = 0;
    }
	
	public void push(Item element) {
		if(index==a.length) resize(a.length*2);
		a[index++]=element;
	}

	public Item pop() {
		Item it = a[index];
		a[index]=null;
		if(index<a.length/4) resize(a.length/2);
		return it;
	}

	public boolean isEmpty() {
		return index>0;
	}

	public int size() {
		return index;
	}

	public Iterator<Item> iterator() {
		return null;
	}

	public class ReverseArrayIterator implements Iterator<Item>{
		private int i = index;
		public boolean hasNext() {
			return i>0;
		}

		public Item next() {
			return a[--i];
		}
		
	}

}
