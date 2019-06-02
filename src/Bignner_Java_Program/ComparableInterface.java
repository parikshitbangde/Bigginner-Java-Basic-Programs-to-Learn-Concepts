package Bignner_Java_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Comparable is use for sorting on different data type
 */
class Stud implements Comparable<Stud>
{
	int rollNo ;
	int marks ; 
	String name;
	
	public Stud(int rollNo, int marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(Stud s)
	{
		return marks> s.marks ? 1:-1 ;
	}
}
public class ComparableInterface {

	public static void main(String[] args) {
		List <Stud> studs = new ArrayList<Stud>();
		
		studs.add(new Stud(8,55,"Piyush"));
		studs.add(new Stud(3,58,"Rohit"));
		studs.add(new Stud(4,53,"Tobu"));
		studs.add(new Stud(12,52,"Pari"));
		
		Collections.sort(studs,(i,j)->i.rollNo>j.rollNo?1:-1);
		
		for (Stud s : studs ) {
			System.out.println(s);
		}
		
		
	}

}
