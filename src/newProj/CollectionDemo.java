package newProj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* COLLECTION INTERFACE DOES NOT SUPPORT INDEX NUMBER
 * collection is used for three cases
 * 1. collection as a interface 
 * 2. collection as a class
 * 3. collection as concept
 * 4. Basically collection is collection of a ellement
 */

public class CollectionDemo {
	public static void main(String[] args) { 
		// Collectio is a interface we need to see which class we canimpliment to creat a object
		Collection values = new ArrayList(); // Collection is a API we can create a reff but not object of it 
		
		values.add(2);
		values.add(5);
		values.add(6);
		
		System.out.println(values); //-> this will give all values at once
		Iterator it = values.iterator();
		 while (it.hasNext()) {
			 System.out.println(it.next()); // it will give line by line output
		 }
		
	}

}
