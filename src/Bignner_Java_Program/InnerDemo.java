package Bignner_Java_Program;
// Here we are trying to understand the work of inner class how access different type of class
/*
 * Inner class type 
 * Member class -> its a class inside a class with no static method   
 * static  class  -> its class in side a class with static type 
 * Anonymus class -> will see it in upcoming programs 
 */
class Outer{
	
	public void show () {
		
		System.out.println("in methode of class Outer  ");
		}
		
		class Inner {
			public void dispaly() {//this a Inner class we can see in main method how to use call for it as obj2 as refrencre
				
				System.out.println("in class Inner  inside a class Outer  ");
				
			}
		}
			static class InnerStatic { /// this a Inner static class we can see in main method how to use call for it as obj2 as refrencre
				public void show1() {
					System.out.println("in static class inside a Outer class ");
				}
			}
			
		
	
	
}

public class InnerDemo {

	public static void main(String[] args) {
		
		Outer obj = new Outer(); // class name : object name = new :constructor 
		obj.show();
		/// how to call the inner class 
		Outer.Inner obj1 = obj.new Inner(); //outer class name.Inner class name : object name = outer class object.new :constructor 
		obj1.dispaly();
		Outer.InnerStatic obj2 = new Outer.InnerStatic();//outer class name.Inner class name : object name = new :outer class name.constructor 
		obj2.show1();



	}

}
