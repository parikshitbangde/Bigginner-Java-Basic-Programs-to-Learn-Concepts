package newProj;

/*
 * while we are working with two thread they should be synchronized 
 * if that is not the case they will access method simultaneously
 * to Avoid this we need to write public synchronized void name
 */
class Counter{
		int count= 0;
	public synchronized void increment () {
		count++;		
	}
}

public class synchroniseThread {
	public static void main(String[] args) throws Exception {
		
		Counter c =new Counter();
		Thread t1 = new Thread(() -> {
			for(int i=0; i<1000;i++) {c.increment();}
		});
		Thread t2 = new Thread(() -> {
			for(int i=0; i<1000;i++) {c.increment();}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Count : "+ c.count);
	}

}
