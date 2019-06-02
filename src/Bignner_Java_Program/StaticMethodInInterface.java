package Bignner_Java_Program;
/*
 * In java 1.8 we can declare variable by default it becomes final declaration it means a constant
 * static method can be declare in the Interface which can be called in main method by jsut interface name.method name 
 */
interface See {
	int o = 10;
	static void show () {
		System.out.println("I m in interface which can be called directly in main method");
	}
}
public class StaticMethodInInterface {

	public static void main(String[] args) {
		//interface name.method name 
		
		See.show();
		
	}

}
