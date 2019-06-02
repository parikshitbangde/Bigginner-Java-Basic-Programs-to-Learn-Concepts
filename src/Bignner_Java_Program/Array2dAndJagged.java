package Bignner_Java_Program;

public class Array2dAndJagged {
	public static void main (String [] args) {
		System.out.println("Enhance for loop for 1d array" );
		System.out.println();
		int a []= {1,2,3,4};
		for (int k : a) {
		System.out.println(k);
		}
		int b []= {2,5,8,7};
		int c [] = {1,4,7,3};
		
		int d[][]= {
				{1,2,3,4},
				{2,5,8,7},
				{1,4,7,3}
		};
		
		System.out.println("single element : "+d[2][2]); // to print single element of array
		
		for (int i = 0; i<3;i++) {
			for (int j = 0;j<4;j++ ) {
				System.out.print(" "+d[i][j]); // this print is for row
			}
			System.out.println(); // this is for printing column
		}
		int e[][]= {
				{1,2,3,4},
				{2,5,7},
				{1,4,7,3}
		};
		System.out.println("Enhance for loop for 2d array and jagged array" );
		System.out.println();
		for (int h[]:e) {
			for (int l:h) 
			{
				System.out.print(" " +l);
			}
			System.out.println();
		}
	
		System.out.println("this is a example of jagged array");
		for (int i1 = 0; i1<e.length;i1++) {
			for (int j1 = 0; j1< e [i1].length; j1++ ) {
				System.out.print(" "+d[i1][j1]); // this print is for row
			}
			System.out.println(); // this is for printing column
		}
		
		
	}

}
