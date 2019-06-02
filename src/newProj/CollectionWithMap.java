package newProj;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map is a interface 
 * so to create object we can use HashMap or HashTable
 * 1.HashMan is unsynchronized Thread is not synchronized
 * 2.HashTable is synchronized
 */
public class CollectionWithMap {
	public static void main(String[] args) {
		Map <String,String> map = new HashMap<>();
		map.put("MyName", "Parikshit");
		map.put("Actor", "Akshay");
		map.put("Brother", "Vikas");
		map.put("Animal", "Tiger");
		
		System.out.println(map);
		
		Set <String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key +"  "+map.get(key));
		}
	}

}
