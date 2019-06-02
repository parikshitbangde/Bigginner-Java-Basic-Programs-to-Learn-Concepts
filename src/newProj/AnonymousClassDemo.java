package newProj;
/*
 * Anonymous class is that class which dont have name and often use to override the parent class
 * 
 */
interface Abc{
	void show();
}
class Implimentor implements Abc {
	public void show() {
		System.out.println(" This is the way to use anonymus class ");
	}
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		Abc obj = new Implimentor() {
			public void show() {
				System.out.println(" This is the way to use anonymus class ");
			}
			
		};
		Abc obj1 =() -> System.out.println("Anonymus class can Use Lambda Expreation directly  ");
		obj1.show();
			
		
		
		obj.show();

		
	}

}
