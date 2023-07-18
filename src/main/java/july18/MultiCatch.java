package july18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division Operation");
			System.out.println("Enter the Numerator");
			int num = sc.nextInt();
			System.out.println("Enter the Denomenator");
			int den = sc.nextInt();
			
			int res = num/den;
			System.out.println("Division result: "+res);
			
			System.out.println("Array Operation");
			System.out.println("Enter the Array Size");
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			System.out.println("Enter the position in which value has to be inserted");
			int pos = sc.nextInt();
			System.out.println("Enter the value to be inserted");
			int val = sc.nextInt();
			arr[pos]=val;
			System.out.println("Value is inserted");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		}catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Array exceptions  handled");
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException handled");
		}catch(Exception e) {
			System.out.println("Generic Exception handled");
		}
	}
}
