package newProj;
/*
 * Comparator class is used for modified sorting
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ColletionWithCOmparetor {
	
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(203);
		values.add(107);
		values.add(428);
		values.add(789);
		
//		Comparator<Integer> c = ((i,j)->
//				{
//			if (i%10<j%10)
//				return -1;
//			else 
//				return 1;
//				});
//		
//		Comparator<Integer> c = new Comparator<Integer>() 
//		{
//			public int compare (Integer i , Integer j) 
//			{
//				if (i%10<j%10)
//					return -1;
//				else 
//					return 1;
//			}
//		};
		Collections.sort(values,( i,j)-> (i%10<j%10?-1:1));
		for (Integer o : values) {
			System.out.println(o);
		}
		
	}

}
