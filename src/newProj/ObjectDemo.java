package newProj;

class Calc{
	
	int num1;
	int num2;
	int res1; // instance variable 
	
	public void perform (){
		//void is return things 
		// public s a acces type
		res1 = num1 + num2;
		
	}
}



public class ObjectDemo {
	public static void main (String[] args) {
		
		//Calc obj; // obj is just a REFRENCE 
		// objet knows something and object does something 
		//obj = new Clac(); // this is a object
		Calc obj =new Calc ();
		obj.num1 = 3;
		obj.num2 = 5;
		obj.perform();
		System.out.println(obj.res1);
	}

}
 