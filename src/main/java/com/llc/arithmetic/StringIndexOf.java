package com.llc.arithmetic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringIndexOf {
   
    public String readTxt() throws IOException{
    	String doupo = "";
    	String filepath = "C:\\Users\\Lingchen Li\\Downloads\\1111.txt";
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filepath),"GBK"));
    	StringBuffer sb = new StringBuffer();
    	String line = "";
    	while((line=br.readLine())!=null){
    		sb.append(line);
    	}
    	doupo=sb.toString();
    	return doupo;
    }
	
	
	
	public int indexOf(String source, String tofind) {
		for (int i = 0; i < source.length(); i++) {
			int j;
			for (j = 0; j < tofind.length(); j++) {
				if (source.charAt(i + j) != tofind.charAt(j)) {
					break;
				}
			}
			if (j == tofind.length())
				return i;
		}
		return -1;
	}

	public int indexOfOptimize(String source, String tofind) {
		/**
		 * 找到第一个值
		 */
		int i = 0;
		char first = tofind.charAt(0);
		int end = source.length() - tofind.length();
		while (i < end) {
			if (source.charAt(i) != first) {
				while (++i < end && source.charAt(i) != first);
			}
			int j;
			for (j = 1; j < tofind.length()&&source.charAt(i + j)==tofind.charAt(j); j++) 
//			{
//				if (source.charAt(i + j) != tofind.charAt(j))
//					break;
//			}
			if (j == tofind.length())
				return i;
			i++;
		}
		return i;
	}

	
	public int indexOfOptimizeAgain(char[] source, char[] tofind) {
		/**
		 * 找到第一个值
		 */
		int i = 0;
		char first = tofind[0];
		int end = source.length - tofind.length;
		while (i < end) {
			if (source[i] != first) {
				while (++i < end && source[i] != first);
			}
			int j;
			for (j = 1; j < tofind.length&&source[i + j]==tofind[j]; j++) 
//			{
//				if (source.charAt(i + j) != tofind.charAt(j))
//					break;
//			}
			if (j == tofind.length)
				return i;
			i++;
		}
		return i;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		StringIndexOf sio = new StringIndexOf();
		String doupo = sio.readTxt();
		System.out.println(doupo.length());
//		System.out.println(doupo);
		System.nanoTime();
		
		char[] a = doupo.toCharArray();
		char[] b = "团员晓寒秋枫校对整理".toCharArray();
		long begintime = System.nanoTime();
		System.out.println(doupo.indexOf("团员晓寒秋枫校对整理"));
		long midtime = System.nanoTime();
        System.out.println(midtime-begintime);
		System.out.println(sio.indexOfOptimizeAgain(a, b));
		long endtime = System.nanoTime();
		 System.out.println(endtime-midtime);
//		System.out.println(sio.indexOfOptimize("adcbcadc", "dc"));
	}
}
