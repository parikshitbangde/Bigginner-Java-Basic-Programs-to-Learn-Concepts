package newProj;
/*
 * Here our code is too big and it can be used Properly
 * As Runnable is Functional Interface we can use Lambda Function
 * We can use anonymous class function
 */


//class Namaste implements Runnable {
//	
//	public void run () {
//		for (int i = 0 ; i <5 ; i++) {
//			
//			System.out.println(" Namaste");
//			try {Thread.sleep(1000);} catch (Exception e) {}
//		}
//	}
//	
//}
//class GoodBoy implements Runnable {
//	
//	public void run () {
//		for (int i = 0 ; i <5 ; i++) {
//			
//			System.out.println(" GoodBoy");
//			try {Thread.sleep(1000);} catch (Exception e) {}
//		}
//	}
//}

public class ThreadWithInterfaceAndLambdaFunction {
	public static void main(String[] args) {
		
		 
		
		Thread t1 = new Thread(() -> {
			for (int i = 0 ; i <5 ; i++) {
				
				System.out.println(" Namaste");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		
	});
		Thread t2 = new Thread(() -> {
			for (int i = 0 ; i <5 ; i++) {
				
				System.out.println(" GoodBoy");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		}
	);
		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
	}

}
