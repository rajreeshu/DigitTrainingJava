package july19_Threads;

import java.util.Scanner;

public class ThreadClass {
	static {
		System.out.println("Hello world");
	}
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Banking Operation");
		System.out.println("Enter the Account no.");
		int accNo = sc.nextInt();
		System.out.println("Enter the Pin:");
		int pin = sc.nextInt();
		System.out.println("Banking operation completed.\n");
		
		
		System.out.println("Printing Operation");
		for(int i=0; i<5; i++) {
			System.out.println("Hello WOrld!!");
			Thread.sleep(3000);
		}
		System.out.println("Printing Completed\n");
		
		
		System.out.println("Addition Operation");
		System.out.println("Enter the First No:");
		int num1= sc.nextInt();
		System.out.println("Enter the second No:");
		int num2 = sc.nextInt();
		System.out.println("Sum: "+(num2+num1));
		System.out.println("Addition is Completed");
	}
}
