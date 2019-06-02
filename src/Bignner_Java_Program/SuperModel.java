package Bignner_Java_Program;
/*
 * in Contruter of a sub class super Method is always call by compiler even if it doesn't called by a programmer 
 * sub class supper method calls a constructor of a super class 
 */
class A{
	public A() {//default constructor
		System.out.println("in A");
	}
	public A(int i) {
		System.out.println("in A int");
	}
}
class B extends A {
	public B() {
		super(5);
		System.out.println("in B");
	}
	public B(int i) {
		super(i); // this supper method is call by compiler if not specified 
		System.out.println("in B int");
	}
}

public class SuperModel {

	public static void main(String[] args) {
		System.out.println("lllllllllllllllllllll");
		B obj =  new B();

	}

}
