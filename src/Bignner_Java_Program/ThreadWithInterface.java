package Bignner_Java_Program;

/*
 * Runable interface does not have any method called run
 */
class Namaste implements Runnable {
	
	public void run () {
		for (int i = 0 ; i <5 ; i++) {
			
			System.out.println(" Namaste");
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
	
}
class GoodBoy implements Runnable {
	
	public void run () {
		for (int i = 0 ; i <5 ; i++) {
			
			System.out.println(" GoodBoy");
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}

public class ThreadWithInterface {

	public static void main(String[] args) {
		/*
		 * you need to create object of a runnable and need to use it in thread objects constructors
		 */
		Runnable obj1 = new Namaste();
		Runnable obj2 = new GoodBoy();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();

	}

}
