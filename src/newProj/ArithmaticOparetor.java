package newProj;
/*arithmatic opreatopr
 * +
 * -
 * *
 *   /(return values in int data type)
 * %
 * 
 * 
 */
public class ArithmaticOparetor {
	public static void main (String args[])
	{
    int c;
    int n = 2;
	int a=4,b=3;
	int r1 = a+b;
	int r2 = a-b;
	int r3 = a*b;
	double r4 = (double)a/b; // division returns the value in int alwyas so we need to cast 
	a +=b; // a = a + b
	int r5 = a/b;
	
	 c = ++n; //pre increment 
	n++; // post increment 
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(r5);
	System.out.println(a);// shows pre increment 
	System.out.println(c);
	
	}
	
			

}
