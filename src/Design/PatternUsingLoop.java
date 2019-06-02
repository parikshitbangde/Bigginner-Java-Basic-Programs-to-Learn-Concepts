package Design;

public class PatternUsingLoop {
	public static void main(String args[]) {
		int n = 7 ;
		int num= 1;
		for (int i = 1;i<n;i++) {
			for (int j = 1;j<i;j++) {
				 {
				System.out.print(num + " ");
				num+=1;
				}
			}
			System.out.println();
		}
	}


  
}   
