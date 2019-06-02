package newProj;
/*
 * system.in.read -> one charater at a time
 * BufferReader OBject
 * Scanner
 */

public class UserInputDemo {
	public static void main(String[] args) throws Exception {
		
		// code to give ASCHI value of every character on the board
		
		int i = System.in.read();// Read method take only one input 
		System.out.println(i);// Giving out ASCHI value
		
		// programe to read one character 
		int j = System.in.read();// Read method take only one input 
		System.out.println((char)j);// char is se to type cast the value
		
		// to read full string
		
		String str = " ";
		while ((i= System.in.read())!=13);
		{
			str = str + i;
		}
		System.out.println(str);
	}

}
