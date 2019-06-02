package newProj;

import java.util.ArrayList;
import java.util.List;

public class CollectionAndGeneric {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
	//name <Genric name> object anme = new class name<>()
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(123); // we can not use String here only integer will be allowed
		
		for(Integer o : values) {
			System.out.println(o);
		}

	}

}
