package july19_Threads;

import java.util.Scanner;

public class MultiThreadingClass {
	public static void main(String[] args) {
		
		System.out.println("Main Method Started.");
		
		Operation op1 = new Operation(); // Operation is a thread class
		op1.setName("Banking");
		
		Operation op2 = new Operation();
		op2.setName("Printing");
		
		Operation op3 = new Operation();
		op3.setName("Add");
		
		op1.start();
		op2.start();
		op3.start();
		
		System.out.println("Main method Ended.");
	}
}

class Operation extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("Banking")) {
			banking();
		}else if(Thread.currentThread().getName().equals("Printing")) {
			printing();
		}else {
			add();
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	void banking() {
		System.out.println("Banking Operation");
		System.out.println("Enter the Account no.");
		int accNo = sc.nextInt();
		System.out.println("Enter the Pin:");
		int pin = sc.nextInt();
		System.out.println("Banking operation completed.\n");
	}
	
	void printing() {
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
	
	void add() {
		System.out.println("Addition Operation");
		System.out.println("Enter the First No:");
		int num1= sc.nextInt();
		System.out.println("Enter the second No:");
		int num2 = sc.nextInt();
		System.out.println("Sum: "+(num2+num1));
		System.out.println("Addition is Completed");
	}
}
