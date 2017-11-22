package com.llc.lang.stack;

public class FixedCapacityStackOfStrings implements Stack<String> {
    private String [] arrayString; 
	private int index;
	public FixedCapacityStackOfStrings(int cap) {
	  	arrayString =new String[cap];
	  	index=0;
	}
	
	public void push(String element) {
		arrayString[index++]=element;	
	}

	public String pop() {	
		return arrayString[--index];
	}

	public boolean isEmpty() {
		
		return index == 0;
	}

	public int size() {
		
		return index;
	}



}
