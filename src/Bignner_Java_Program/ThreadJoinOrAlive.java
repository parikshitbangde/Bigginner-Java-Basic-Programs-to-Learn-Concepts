package Bignner_Java_Program;
/*
 * main thread is inactive to activate the thread we need use JOIN
 * And to check Thread is working or not we need to use ISALIVE method
 */

public class ThreadJoinOrAlive {
	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread (()-> {
			
			for (int i=0;i<5;i++) {
				
				System.out.println("Hi");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		}) ;
		
		Thread t2 = new Thread (()-> {
			
			for (int i=0;i<5;i++) {
				
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		}) ;
		
		
		 
		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		t1.join();// this is to make main thread to wait till t1 and t2 Job finishes 
		t2.join();
		System.out.println(t1.isAlive()); // it is to check weather thread is alive or not
		
		System.out.println("bye");
	}

}
