package newProj;

/*
 * Array is a collection of elements 
 * types of array 
 * 1d array
 * 2d array (square arrays ->its a heap of equi dimensional array)
 * jagged array (->its a heap of Non-equi dimensional array)
 */



public class ArraysDemo {
	public static void main (String[] args) {
		int nums[] = new int[4];// simple way of creating arrays 
		nums[0] = 22;
		nums[1] = 42;
		nums[2] = 23;
		nums[3] = 212;
		System.out.println("the value of first element in the array  :" + nums[0]);
		for (int i= 0;i<4;i++) { // this is a way to access to all elements in the array 
		System.out.println(nums[i]);
		}
		
		int newstyle [] = {1,52,236,4528,756}; // if you Know the entries in the values before hand 
		for (int j = 0 ; j<5 ; j++) {
			System.out.println(newstyle[j]);
			
		}
		// normal way to creat object of student class
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		Student s[] = new Student[4];/// method 1
		//Student s1[] = {s1,s2,s3,s4};
		System.out.println(s[0]);
				
	}

}
