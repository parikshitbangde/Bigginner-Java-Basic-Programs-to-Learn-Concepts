package newProj;
/*
 * Collection is an API it has certain class which we can such as sort
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassForSorting {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		//name <Genric name> object anme = new class name<>()
			values.add(2);
			values.add(3);
			values.add(4);
			values.add(123); // we can not use String here only integer will be allowed
			
			Collections.sort(values);
			Collections.reverse(values);
			
			for(Integer o : values) {
				System.out.println(o);
			}
	}

}
