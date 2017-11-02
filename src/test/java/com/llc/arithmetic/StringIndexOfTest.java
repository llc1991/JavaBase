package com.llc.arithmetic;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringIndexOfTest {
	StringIndexOf sio = new StringIndexOf(); 
	@Test
	public void testIndexOf() {
		
		assertEquals(3,sio.indexOf("11223", "23"));
	}

}
