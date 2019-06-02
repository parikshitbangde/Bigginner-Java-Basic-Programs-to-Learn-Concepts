package newProj;
/*
 * In java 1.8 multiple implementation of intercaes is allowed 
 * using multiple interface give rise to ambiguity problem 
 * ambiguity problem can be solve by specifying your new method in class it seldf 
 * OR by using interface name .super.method name 
 */

interface Demo{
	
	default void show (){
		
		System.out.println("I m in Demo show");
	}
}
interface MyDemo{
	default void show (){
			
			System.out.println("I m in MyDemo show");
		}
	
}

class DemoImp implements Demo,MyDemo {
	public void abc () {
		System.out.println("I am in demoImp");
	}
	// To avoid ambiguity problem we need to use supper
	public void show () {
		Demo.super.show();
	}
}
public class SuperMethodINInterface {
	public static void main (String[] args) {
		DemoImp obj = new DemoImp();
		obj.abc();
		obj.show();
	}

}
