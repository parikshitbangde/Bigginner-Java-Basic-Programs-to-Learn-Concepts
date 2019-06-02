package Design;

public class BoxPattern {
	public static void main(String args[]) {
		//outer loop is to hanle number of rows here 5
		
		  { 
		        int i, j; 
		        for (i = 1; i <= 10; i++) 
		        { 
		            for (j = 1; j <= 40; j++) 
		            { 
		                if (i == 1 || i == 10 ||  
		                    j == 1 || j == 40)             
		                    System.out.print("*");             
		                else
		                    System.out.print(" ");             
		            } 
		            System.out.println(); 
		        } 
		       
		    }  
	}

}
