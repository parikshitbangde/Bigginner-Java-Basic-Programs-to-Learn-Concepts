package newProj;
/*
 * in this program we are under standing about runtime polymorphisim and dynamic dispatch method 
 */


class A2{
	public void Show() {
	
		System.out.println("In A2");
	}
}

class B2 extends A2 {
	public void show () {
		System.out.println("in B");
	}
}
class C2 extends A2{
	public void show () {
		System.out.println("IN C");
	}
}
public class DynamicMethodDispatch {
	public static void main(String[] args) {
		
		A2 obj3 = new B2() ; // ref object :object of a  called method of a class 
		obj3.Show();
		obj3 = new C2();
		obj3.Show();
	}

}
