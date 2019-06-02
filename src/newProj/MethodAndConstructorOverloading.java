package newProj;
// method overloading with same name but different parameter 
class Emp{
	
	int empid ;
	int salary;
	int Ta;
	String ceo;
	// constructor overloading 
	public void show (){
		System.out.println(empid + " " + salary +" " + Ta +" " + ceo);
		
	}
	public void add (int salary , int Ta) {// its taking 2 parameters
		System.out.println(salary + Ta);
		
	}
	public void add (double salary , double Ta) {// its taking 2 double having double 
		System.out.println(salary + Ta);
		
	}
	public void add (int salary , int Ta,int a) {// this method is takig three values 
		System.out.println(salary + Ta);
		
	}
	// constructor overloading
	public Emp( int w) {
		
		
	}

	public Emp(int q, int w) {
		
		
	}
	
}
	

public class MethodAndConstructorOverloading {
	public static  void main (String [] args) {
		Emp Kishan = new Emp(1);
		Kishan.empid = 77;
		Kishan.salary = 1200;
		Kishan.ceo = "Ravi Teja";
		Kishan.Ta = 36;
		Kishan.add(123,365);
		Kishan.add(2.2,3.3);
		Kishan.add(12,19,20);
		Kishan.show();
		
		 
				
		
	}	
	} 


