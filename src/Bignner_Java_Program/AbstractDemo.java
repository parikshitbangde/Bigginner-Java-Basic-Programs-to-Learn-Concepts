package Bignner_Java_Program;
// abstract class is use for a purpose of no one can create those class and many class can be extended to it abstract class  which are interlinked
// how to create abstract class and method is given bellow 
abstract class Human {
	
	public abstract void eat(); // we can declare abstract method 
	// abstract class is must to have abstract method 
	// but its not compulsory to have abstract class to have abstract method 
	public void walk() {
		
	}
}
class Man extends Human {
	//every methode which is decleare as a abstract method in abstract class should be written
	public void eat() {
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		//Human obj = new Human();  // We can not create the human object because its a abstract class 
		Human obj = new Man();  // we can use ref object of Human but we need to create object of man 
	}

}
