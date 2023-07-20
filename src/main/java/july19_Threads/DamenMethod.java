package july19_Threads;

public class DamenMethod {
	public static void main(String[] args) {
		MsOffice2 ms1 = new MsOffice2();
		ms1.setName("Typing");
		
		MsOffice2 ms2 = new MsOffice2();
		ms2.setName("Checking");
		
		MsOffice2 ms3 = new MsOffice2();
		ms3.setName("Saving");
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		
		ms1.start();
		ms2.start();
		ms3.start();
	}
}

class MsOffice2 extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("Typing")) {
			typing();
		}else if(Thread.currentThread().getName().equals("Checking")) {
			checking();
		}else {
			saving();
		}
	}
	//Primary
	void typing() {
		for(int i=0; i<5; i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//Secondary
	void checking() {
		for( ; ; ) {
			System.out.println("Checking...");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	//secondary
	void saving() {
		for( ; ; ) {
			System.out.println("Saving...");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}


