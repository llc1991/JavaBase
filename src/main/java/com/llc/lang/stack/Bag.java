package com.llc.lang.stack;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>{
	private Node first;

	private class Node {
		Item item;
		Node next;
	}

	public void add(Item item) {
		Node temp = first;
		first = new Node();
		first.item = item;
		first.next = temp;
	}

	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public class bagIterator implements Iterator<Item>{
		
		private Node current = first;
		public boolean hasNext() {
			return current!=null;
		}

		public Item next() {
			Item item = current.item;
			current=current.next;
			return item;
		}
		
	} 
	
}
