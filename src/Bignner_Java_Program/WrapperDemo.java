package Bignner_Java_Program;
/*
 * In Java every things needs to a object 
 * int is a primitive data type whose concept is derived from cPogramming
 * the process of converting primitive data type into a object is called as wrapping 
 * Warping operates slower then primitive data types 
 */

public class WrapperDemo {
	public static void main (String [] args) {
		
		
		//int i = 5;  // primitive datatype
		// Way to set variable 
		Integer ii = new Integer(10); //wrapping- boxing
		int j = ii.valueOf(ii);// Unboxing - unwarapping
		System.out.println("unboxing or unwrapping"+ii);
				
		Integer value = ii; // auto boxing 
		
		int k = value;
		System.out.println("auto unboxing "+k); //auto unboxing 
		
		// Methode for parsing string to Integer
		String str = "123";
		int w = Integer.parseInt(str);
		System.out.println("Methide to parse str to Int "+w);
		
				
				
		
	} 

}
