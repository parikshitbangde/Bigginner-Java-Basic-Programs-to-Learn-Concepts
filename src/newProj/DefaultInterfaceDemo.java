package newProj;
/*
 * In java 1.8 Interface method can can have one declare method and many default method 
 */

interface Seen{// interface can have many default method
	void Abc();
	default void show () {
		
	}
}
class Abs implements Seen {
	public void Abc() {
		System.out.println("I am in Abs class");
		
	}
	public void show () {
		System.out.println("I can override the default method of interface ");
	}
	
}
public class DefaultInterfaceDemo {

	public static void main(String[] args) {
		
		Seen obj = new Abs();
		obj.Abc();
		obj.show();
		
		
	}

}
