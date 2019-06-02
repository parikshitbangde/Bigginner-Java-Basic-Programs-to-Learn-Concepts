package newProj;

class Calc1{
	
	int num1;
	int num2;
	int res1; // instance variable 
	// creating a constructor 
	public Calc1() {
		num1 = 2;
		num2 = 3;
		System.out.println("ITS IN CONSTRUCTOR");
	}
	// create a second constructor with different signature 
	
	public Calc1(int n) {
		num1 = n;
		num2 = n;
		System.out.println("Its in second constructor with different signature");
	}
	public Calc1(int number1,int number2) {
		num1 = number1;  // number1 is a local variable 
		num2 = number2;  // num1 is a object or instance variable 
		System.out.println("Understand the concept of local and  instance variable");
	}
	
	public Calc1(int num1,int num2,int num3) {
		this.num1 = num1;  // number1 is a local variable 
		this.num2 = num2;  // num1 is a object or instance variable 
		System.out.println("Understand the concept of this(this specifies the scope of variable is related to instance its not local variable");
	}
	
	public void perform (){
		//void is return things 
		// public s a acces type
		res1 = num1 + num2 ;
		
	}
}

public class ConstrutorBasic {
	public static void main (String[] args) {
		
		Calc1 pari = new Calc1(7,3,4); // constructor
		//pari.num1 = 2;
		//pari.num2 = 3;
		pari.perform ();
		System.out.println(pari.num1);
		System.out.println(pari.num2);
	}

}
