package newProj;
/*
 * Final can be use with 1. Variable 2.Class 3.Method
 * 
 * 1.if we use final with variable it becomes constant 
 * 2.if we use final with class it Becomes Inheritable
 * 3.if we use final with Methode no on can call it again it means no one can override it 
 */
final class Day{
	final int Day =12 ; 
	public  void  show()
	{
		//Day =20; // As Day is linked to final that Day variable is become constant
		System.out.println("In day : " + Day);
	}	
}
class W  {// here if we extend our class to Day it will show error because it is linked to final 
	public  void show (){
		System.out.println(" hi");
		
	}
}
class Q extends W {
	public void show (){
		System.out.println(" hi");
		
	}
}

public class FinalDemo {

	public static void main(String[] args) {

		Day obj = new Day();
		obj.show();
		Q obj1 = new Q();
		obj1.show(); // if we the Method is linked with final we can not use it 
		
		
	}

}
