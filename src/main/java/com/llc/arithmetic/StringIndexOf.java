package com.llc.arithmetic;

public class StringIndexOf {

	public int indexOf(String source, String tofind) {
		for (int i = 0; i < source.length(); i++) {
			int j;
			for (j = 0; j < tofind.length(); j++) {
				if (source.charAt(i+j) != tofind.charAt(j)) {
					break;
				}
			}
			if(j==tofind.length())
            return i;
		}
		return -1;
	}

   public int indexOfOptimize(String source,String tofind){
	   /**
	    * 找到第一个值
	    */
	   int i = 0;
	   char first = tofind.charAt(0);
	   int end=source.length()-tofind.length();
	   if(source.charAt(i)!=first){
		   while(++i<end&&source.charAt(i)!=first);
	   }

	   while(i<end){
		   int j;
		   for(j=1;j<tofind.length();j++){
			   if(source.charAt(i+j)!=tofind.charAt(j))
				   break;
		   }
		   if(j==tofind.length()) return i;
		   i++;
	   }
	   return i;
   }

   public static void main(String[] args) {
	 StringIndexOf sio = new StringIndexOf();
	 System.out.println(sio.indexOfOptimize("abcadc", "dc"));
   }
}
