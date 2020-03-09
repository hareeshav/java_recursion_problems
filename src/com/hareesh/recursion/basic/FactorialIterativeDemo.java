package com.hareesh.recursion.basic;

public class FactorialIterativeDemo {
	
	private static int factorialIterative(int n) {

	      int factorialResult = 1;

	      for (int i = 1; i <= n; i++) {
	        factorialResult = factorialResult * i;
	      }
	      return factorialResult;
	      
	    }

	    public static void main( String args[] ) {
	        int result = factorialIterative(5);
	        System.out.println("The factorial is: " + result);
	    }

}
