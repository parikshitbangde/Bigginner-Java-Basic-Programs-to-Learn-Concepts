package Bignner_Java_Program;

public class JumpDemo {
	public static void main (String args[]) {
		for (int i = 1; i<=10; i++) {
			if (i == 7) {
				continue;
				
			}
			if (i==9)
			{break;}
			System.out.println("value is "+ i);
		}
	}
	

}
