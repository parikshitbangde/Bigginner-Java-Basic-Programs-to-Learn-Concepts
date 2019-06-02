package Bignner_Java_Program;

class Student {
	int rollNumber;
	int studentID;
	int studentRank;
	static String classTeacher; // here writing static because it will remain same for all objects 
	
	static { // static block works only once while loading the class. first object loads then class
		
		classTeacher = "Iron Man";
		System.out.println("in staticfield ");
	}
	
	public Student () {
		rollNumber = 1;
		studentID = 132;
		studentRank = 3;
		System.out.println(" in constructor ");
		
	}
	
	
	public void show () { // Mtehod because void is used 
		System.out.println(rollNumber + " : " + studentID + " : " + studentRank + " : "+  classTeacher);
		
	}	
}

public class StaticDemo {
	public static  void main (String [] args) {
		Student piyush = new Student(); // first object is created
		piyush.rollNumber =10;
		piyush.studentID = 554879;
		piyush.studentRank = 2;
		
		
		Student ravi = new Student(); // object object is created
		ravi.rollNumber =10;
		ravi.studentID = 554870;
		ravi.studentRank = 2;
		
		
		
		Student rahul = new Student ();
		piyush.show();
		ravi.show();
		rahul.show();
	}

}
