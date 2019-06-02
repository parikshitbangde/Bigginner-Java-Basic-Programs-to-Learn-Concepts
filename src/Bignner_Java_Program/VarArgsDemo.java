package Bignner_Java_Program;

class Calcu{
	public int add (int ...n) { //triple dots make it possible to take multiple values as a parameter
		int sum = 0;
		for (int i:n) {
			sum = sum +i;
		}
		return sum;
	}
}

public class VarArgsDemo {
	public static void main (String [] args) {
		Calcu obj = new Calcu();
		System.out.println(obj.add(2,2,2,2));// all the passed values converted into a array in Method 
	}

}
