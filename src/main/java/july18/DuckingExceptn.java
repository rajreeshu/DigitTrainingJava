package july18;

import java.util.Scanner;

class Operations{
	void function1() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division Operation:");
			System.out.println("Enter Numerator:");
			int num = sc.nextInt();
			System.out.println("Enter the Denomenotor:");
			int den = sc.nextInt();
			int res = num/den; // critical statement
			System.out.println("Division result: "+res);
		}catch(Exception e){
			System.out.println("Exception Handled in Function1");
			throw e;
		}
		
		finally {
			System.out.println("Left Function1"); //this will be executed regardless of error thrown
		}
		
	}
}

public class DuckingExceptn {
	public static void main(String[] args) {
		Operations op = new Operations();
		try {
			op.function1();
		}catch(Exception e) {
			System.out.println("Exception handled in Main Method");
		}
		
		
		
	}
}
