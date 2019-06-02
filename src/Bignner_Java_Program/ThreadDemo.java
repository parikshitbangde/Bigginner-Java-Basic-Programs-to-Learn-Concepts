package Bignner_Java_Program;

/* Thread is a single unit of a process
 * Multi threading is done for parallel computing 
 * In JAVA by default we use one thread that is main
 * Threarding sever three purpose 
 * 1. parallel computing to use full computational power of CPU
 * 2. Servlet (Asynchronous Request to server )
 * 3.can acess web application or gameing link PUBG by using Multi threadind
 * to Thread we need to extend our class or use RUNABLE interface
 *  
 *  */

class Hi extends Thread {
	
	public void run() 
		{// thread start will always look for run method 
		
		for (int i = 0 ; i < 5 ; i++) {
		System.out.println("HI");
		try{Thread.sleep(1000);} catch (Exception e) {}
	    }
	}		
}

class Hello extends Thread {
	
	public void run() 
		{// thread start will always look for run method 
		
		for (int i = 0 ; i <5 ; i++) {
		System.out.println("Hello");
		try{Thread.sleep(1000);} catch (Exception e) {}
	    }
	}
}
/*
 * When ever thread is started it will call a run method 
 */
public class ThreadDemo {
	public static void main(String[] args) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		
		try{Thread.sleep(10);} catch (Exception e) {}
		
		obj2.start();
		
		
	}

}
