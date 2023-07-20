package july18;

import java.util.Scanner;

class Operation {
	void function1() throws Exception {
		System.out.println("Inside fun1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Division Operation:");
		System.out.println("Enter Numerator:");
		int num = sc.nextInt();
		System.out.println("Enter the Denomenotor:");
		int den = sc.nextInt();
		int res = num/den; // critical statement
		System.out.println("Division result: "+res);
		System.out.println("Exit function1");
	}
	
	void function2() throws Exception {
		System.out.println("Inside fun2");
		function1();
		System.out.println("Exit function2");
	}
	
	void function3() {
		try {
//			System.out.println("");
			System.out.println("Inside fun3");
			function2();
		}catch(Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("Exit function3");
	}
}

public class DuckingException {
	public static void main(String[] args) {
		System.out.println("Inside main");
		Operation op = new Operation();
		op.function3();
		System.out.println("Exit main");
	}
}
