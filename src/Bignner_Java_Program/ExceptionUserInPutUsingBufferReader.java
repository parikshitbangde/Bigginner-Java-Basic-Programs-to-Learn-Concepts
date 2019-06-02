package Bignner_Java_Program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionUserInPutUsingBufferReader {
	public static void main(String[] args) throws Exception{
		
		
		System.out.println("Enter the Number");
		int n = 0;
		try {
		InputStreamReader is  ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 n = Integer.parseInt(br.readLine());
		}
		//
		/* try block can be written as 
		 *try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){}
		 *above syntax is called as try with Reource
		 * in the above style we dont need Catch and Finally block
		 * 
		 */
		finally {
		System.out.println(n);
		
		}
	}

}
