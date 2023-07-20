package july19_Threads;

import java.beans.IntrospectionException;

public class LocksClass {
	public static void main(String[] args) throws InterruptedException{
		Gender g1 = new Gender();
		g1.setName("Boy");
		
		Gender g2 = new Gender();
		g2.setName("Girl");
		
		Gender g3 = new Gender();
		g3.setName("Others");
		
		g1.start();
		g1.join();
		g2.start();
		g2.join();
		g3.start();
	}
}

class Gender extends Thread{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" Entered the Bathroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" Using the Bathroom");
			Thread.sleep(6000);
			System.out.println(Thread.currentThread().getName()+" Left the Bathroom");
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
