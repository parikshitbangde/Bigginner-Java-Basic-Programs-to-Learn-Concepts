package Bignner_Java_Program;
/*
 * In this program we setting name of thread and priority
 */

public class ThreadNameAndPriority {
	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(()->
		{
			for (int i=0 ;i<5;i++) {
				System.out.println(" Hi :" + "   thread priority :   "+ Thread.currentThread().getPriority()+"   Thread Name :  " +Thread.currentThread().getName());
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
			
		}, "Hi Tread");
		Thread t2 = new Thread(()->{
			for (int i=0 ;i<5;i++) {
				System.out.println(" Hello :" + "   thread priority :   "+ Thread.currentThread().getPriority()+"   Thread Name :  " +Thread.currentThread().getName());
				try {Thread.sleep(1000);} catch (Exception e) {}
			}
		}," Hello Thread");
		
		t1.setPriority(Thread.MIN_PRIORITY); // 1 = least
		t2.setPriority(Thread.MAX_PRIORITY); // 10 = highest
		
		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}

		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("All Done ");
	}

}
