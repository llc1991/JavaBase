package com.llc.lang.stack;

import java.util.NoSuchElementException;


public class Algs4Stack<Item> implements Stack<Item> {
    private Node<Item> first;
	private int n;
	
	private static class Node<Item>{
		private Item item;
		private Node<Item> per;//存放前一位存放的节点
	}
	
	public Algs4Stack() {
		first=null;
		n=0;
	}
	
	public void push(Item element) {
	     Node<Item> per = first;	
	     first=new Node<Item>();
	     first.item=element;
	     first.per=per;
	     n++;
	}

	public Item pop() {
		if(isEmpty()) throw new NoSuchElementException("空栈");
		Node<Item> current = first;
		first=current.per;
		n--;
		return current.item;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {	
		return n;
	}
  
}
