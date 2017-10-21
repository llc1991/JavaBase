package com.llc.reconsitution;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Lingchen Li 在一般领域，对正整数n，如果用2到n的开平方 之间的所有整数去除，均无法整除，则n为质数。 质数大于等于2
 *         不能被它本身和1以外的数整除
 */
public class PrimeNumber {
	
	
	public List<Integer> generatePrimes(int maxValues){
		List<Integer> primesList = new ArrayList<Integer>();
		for (int i = 0; i <=maxValues; i++) {
			if(checkPrime(i))
			primesList.add(i);
		}
		return primesList;
	}
	
	
	
	public static boolean checkPrime(int n) {
		if (n <= 3)
			return n > 1;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;

	}

	public static boolean checkPrimesqrt(int n) {
		if (n <= 3)
			return n > 1;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;

	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		List<Integer> primesList = primeNumber.generatePrimes(20);
		for (Integer integer : primesList) {
			System.out.println(integer);
		}
	}
	
//	public static void main(String[] args) {
//		for (int i = 0; i < 20; i++) {
//			System.out.print(i);
//			System.out.println(" is " + checkPrimesqrt(i));
//		}
//	}

}
