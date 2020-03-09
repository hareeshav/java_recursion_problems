package com.hareesh.recursion.basic;

public class CountDigitsRecursive {
	

	public static int countDigits(int num) {
		
		  if(num <= 1){
			  return 1;
		  }
		  else 
			  return 1+countDigits(num/10); 
	      
	    }

	    public static void main( String args[] ) {
	      
	        int input = 1435043;
	        int numDigits = countDigits(input);
	        System.out.println("Number of digits in " + input + " = " + numDigits);
	    }


}
