package Bignner_Java_Program;

import java.util.Scanner;

public class ScanerUserInPutUsing {
	public static void main(String[] args) {
		
		/*
		 * Scanner Hande error automatically	 
		 */
		int n = 0;
		System.out.println("ENTER A NUMBER ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println(n);
	
	}

}
