package newProj;
/*
 * try , catch , finally
 * try is use full to use over a critical block where error may appear
 * catch is the black where you can specify the error type to user 
 * finally is block where you want do on any process 
 */
public class ExceptionHandleingDemoForSingleErorr
{
	public static void main (String [] args) {
		
		try { // use try to prevent your code from blowing up and display error msg 
		int i= 3;
		int j=3;
		int d  = 0;
		int k = i/j;
		System.out.println(k);
		}
		catch (Exception e) {
			System.out.println("Error");
		}
		finally {
		System.out.println("Bye");
	}
  }
}
