package Bignner_Java_Program;
// Inheritance is a property in Java which enable a programmer to use properties of a previous class called parent class in a new class 
//which is called as child class 

class Calci{ // supper class
	public int add (int i , int j) {
		return i+j;
	}
}
class CalciAvd extends Calci { //sub class 
	public int sub (int i , int j) {
		return i-j;
	}
}
class ClaciVeryAVd extends CalciAvd{
	public int multi ( int i,int j) {
		return i*j;
		
	}
}


public class InheritanceDemo {
	public static void main (String [] args) {
		
		Calci obj = new Calci();
		int result = obj.add (2,4);		
		System.out.println("Result of normal class is :  "+result);
		
		
		CalciAvd obj1 = new CalciAvd();
		int result2 = obj1.sub(4,3);
		System.out.println("Result of a single leve inherited class is :  "+ result2);
		
		
		ClaciVeryAVd obj3 = new ClaciVeryAVd();
		int result3 = obj3.multi(2,3);
		System.out.println("Result is a multi level inheritance class is : "+ result3);
	}

}
