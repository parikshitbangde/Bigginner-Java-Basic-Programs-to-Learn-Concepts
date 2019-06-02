package Bignner_Java_Program;

/*
 * As we know class B is child class of a parent class A.
 * constructor of class B will call constructor of class A 
 * but child class over rides the method of parents class 
 * Super.show can be use to nullyfiy the effect of method overriding
 * 
 */
class A1{
	public void show () {
		System.out.println(" IN A" );
		
	}
}
class B1 extends A1 {
	public void show () {
		super.show();
		System.out.println("IN B");
	}
}

public class MethodOverridingDemo {
	public static void main (String[] args) {
		
		B1 obj = new B1();
		obj.show();
		
	}

}
