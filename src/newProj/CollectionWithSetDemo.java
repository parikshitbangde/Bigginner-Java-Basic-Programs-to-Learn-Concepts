package newProj;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set Interface 
 * To create object of interface we need to class 1.HashSet  2. TreeSet
 */

public class CollectionWithSetDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		System.out.println(values.add(245));
		values.add(245);
		values.add(124);
		values.add(248);
		values.add(212);
		
		for (int s:values) {
			System.out.println(s);
		}
		Set<Integer> v = new TreeSet<>();
		System.out.println(values.add(245));
		v.add(245);
		v.add(124);
		v.add(248);
		v.add(212);
		
		for (int qs:v) {
			System.out.println("TreeSet is used for sequencing the integer : "+qs);
		}
	}

}
