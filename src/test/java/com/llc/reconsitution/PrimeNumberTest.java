package com.llc.reconsitution;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {

	@Test
	public void testGeneratePrimes() {

	}

	@Test
	public void testCheckPrime() {
		boolean check = PrimeNumber.checkPrime(10);
		assertEquals(check, false);
	}

	@Test
	public void testCheckPrimesqrt() {
		boolean check = PrimeNumber.checkPrimesqrt(10);
		assertEquals(check, false);
	}

	@Test
	public void testMain() {
		
	}

}
