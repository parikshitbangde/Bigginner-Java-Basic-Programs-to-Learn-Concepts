package Bignner_Java_Program;

public class TernaryOperator {
	public static void main (String args[]) {
		int n = 8;
		int f = 0;
		int j;
		if (n > 6){
			f = 1;
		}
		else {
			f = 2;
		}
		System.out.println(f);
		
		// Same above work can be done by using ternary operator ?:
		j = n>6?3:4;
		System.out.println(j);
	}

}
