package Bignner_Java_Program;

import java.util.ArrayList;
import java.util.List;

/*
 * Index is not supported in collection Interface 
 * so we use List interface 
 * list extends to collection and implements ArrayList
 * 
 */

public class CollectionWithList {
	public static void main(String[] args) {
		
		List values = new ArrayList();
		values.add(3);  // object of integer
		values.add(4);
		values.add(6);
		values.add(2, 2);
		values.add("pari");
		// normal For Loop
		for (int i = 0 ; i<values.size();i++) {
			System.out.println(values.get(i));
		}
		
		System.out.println("Enhanced for loop Method"); 
		for (Object o : values) {
			
			System.out.println(o);
		}
	}

}
