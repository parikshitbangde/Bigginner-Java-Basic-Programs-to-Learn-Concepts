package Bignner_Java_Program;
/*
 * Interface works like abstract class with more advantages 
 * abstract class needs to be extended by child class 
 * Interface needs to be implemented by another class thus providing a space for multiple inheritance 
 *  type of Interface 1. Normal 2.Single abstract method Interface - Functional Interface 3.Marker Interface 
 *  Normal Interface contain more then one method 
 *  Functional Interface has only one method 
 *  Marker Interface has no method
 * We can not create object of Interface 
 * Method define in Interface are public abstract by default 
 * NO CONSTRUCTURE IN INTERFACE 
 */

interface Writer {
	void writer (); // IN Interface you can not define method you can just declare it 
// public and abstract are by default given by compiler so no need to write it separately
}

class Pen implements Writer{
	public void writer() {
		System.out.println("I m A Pen");
	}
	
}
class Pencil implements Writer{
	public void writer() {
		System.out.println("I m A Pencil");
	}
	
}

class Kit {
	
	public void doSomthing(Writer p) {
		p.writer();
		
	}
}
public class InterfaceDemo {
	public static void main (String[] args) {
		
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		k.doSomthing(pc);
		
	}
	

}
