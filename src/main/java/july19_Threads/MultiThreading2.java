package july19_Threads;

import java.util.Scanner;

public class MultiThreading2 {
	public static void main(String[] args) {
		System.out.println("Starts Main");
		
		Banking bk = new Banking();
		bk.setPriority(6);
		bk.start();
		
		Printing pt = new Printing();
		pt.setPriority(4);
		pt.start();
		
		Add ad = new Add();
		ad.setPriority(3);
		ad.start();
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println("Exceptuin");
		}
		
		System.out.println("Main ends");
	}
}

class Banking extends Thread{
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

class Printing extends Thread{
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

class Add extends Thread{
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
