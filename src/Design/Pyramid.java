package Design;

public class Pyramid {
	public static void main(String args[]) {
		//outer loop is to hanle number of rows here 5
		int num = 1;
		for (int i=0; i<5;i++) {
			//System.out.print(i);
			for (int j = 5-i;j>1;j--) {
				// this loop is for handeling the spaces 
				System.out.print(" ");
			}
			for (int j =0; j<=i;j++) {
				// to handel print 
				System.out.print("* " );
				num +=1;
			}
			System.out.println();
		}
	}

}
