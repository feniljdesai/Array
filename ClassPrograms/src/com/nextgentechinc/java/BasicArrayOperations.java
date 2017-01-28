package com.nextgentechinc.java;

public class BasicArrayOperations {
	
	 private static void printArray(int[] Array) {
	      for (int i = 0; i < Array.length; i++) {
	         if (i > 0){
	            System.out.print(", ");
	         }
	         System.out.print(Array[i]);
	      }
	   }
	   public static void main(String[] args) {
	      int[] testArray = { 1, 2, 3, 4, 5, 6, 7 };
	      printArray(testArray);
	   }

		
	}
	
	

