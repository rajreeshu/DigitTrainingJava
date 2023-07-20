package july18;

import java.util.Scanner;

class UnderAgeException extends Exception {
	public String getMessage() {
		return "You are Under age";
	}
}

class OverAgeException extends Exception {
	public String getMessage() {
		return "You are Over age";
	}
}


class Candidate{
	int age;
	void getData() {
		System.out.println("Enter the Age:");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
	}
	
	void verify() throws Exception{
		if(age<18) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}else if(age>60) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}else {
			System.out.println("License is Issued");
		}
	}
}

//class Rto{
//	void grantLicense(Candidate c) {
//		try {
//			c.getData();
//			c.verify();
//		}catch(Exception e) {
//			System.out.println("Age Exception Handled");
//		}
//	}
//}

class Rto{
	void grantLicense(Candidate c) {
		try {
			c.getData();
			c.verify();
		}catch(Exception e) {
			try {
				c.getData();
				c.verify();
			}catch(Exception e1) {
				try {
					c.getData();
					c.verify();
				}catch(Exception e2) {
					System.out.println("3 Limit Exceeded");
				}
			}
		}
	}
}

public class CustomException {
	public static void main(String[] args) {
		Candidate c1 = new Candidate();
		Rto rto = new Rto();
		rto.grantLicense(c1);
		
	}
}
