package newProj;
/*
 * from java 1.7 its possible to add multiple expectation in a single line 
 */

public class ExpectationHandlingForMultipleError {

	public static void main(String[] args) {
		// if index of array is out of range then divide by zero will not be executed
		try {
		int a [] = new int [4];
		 a[3] = 9;
		 int i = 3;
		 int j = 0;
		 int k = i/j;
		 System.out.println(k);

		}
		// first way to write catch
//		catch (ArithmeticException | ArrayIndexOutOfBoundsException  e){
//					
//					System.out.println("Divided by Zero Mathematical error Or array out of range");
//				}
		catch (ArithmeticException  e){
			
			System.out.println("Diveded by Zero Mathematical error");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Select Array index Properly");
		}
		catch (Exception e) {
			System.out.println("Something wrong Happen");
		}
		finally {
			System.out.println("Please check your Selection");
		}
	}

}
