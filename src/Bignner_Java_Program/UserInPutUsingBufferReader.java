package Bignner_Java_Program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInPutUsingBufferReader {
     public static void main (String[] args) throws Exception {
    	 
    	 System.out.println("Enter a Number");
    	 
    	 
    	 InputStreamReader is = new InputStreamReader(System.in); 
    	 BufferedReader br = new BufferedReader(is);
    	 
    	 // below code will also work 
    	 //InputStreamReader is;
    	 //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 
    	 
    	 int n = Integer.parseInt(br.readLine());  //32
    	 System.out.println(n);
    	 
		
	}	

}
