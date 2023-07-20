package july19_Threads;

import java.util.Scanner;

public class MultiThread3 {
	public static void main(String[] args) {
		Bankings b = new Bankings();
		Printings p = new Printings();
		Adds a = new Adds();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(a);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

class Bankings implements Runnable{
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Operation");
		System.out.println("Enter the Account no.");
		int accNo = sc.nextInt();
		System.out.println("Enter the Pin:");
		int pin = sc.nextInt();
		System.out.println("Banking operation completed.\n");
	}
}

class Printings implements Runnable{
	public void run() {
		System.out.println("Printing Operation");
		try {
			for(int i=0; i<5; i++) {
				System.out.println("Hello WOrld!!");
				Thread.sleep(3000);
			}
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		System.out.println("Printing Completed\n");
	}
}

class Adds implements Runnable{
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition Operation");
		System.out.println("Enter the First No:");
		int num1= sc.nextInt();
		System.out.println("Enter the second No:");
		int num2 = sc.nextInt();
		System.out.println("Sum: "+(num2+num1));
		System.out.println("Addition is Completed");
	}
}

