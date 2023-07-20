package july19_Threads;

public class RaceCondition {
	public static void main(String[] args) {
		MsOffice ms1 = new MsOffice();
		ms1.setName("Typing");
		
		MsOffice ms2 = new MsOffice();
		ms2.setName("Checking");
		
		MsOffice ms3 = new MsOffice();
		ms3.setName("Saving");
		
		
		ms1.start();
		ms2.start();
		ms3.start();
		
		
	}
}

class MsOffice extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("Typing")) {
			typing();
		}else if(Thread.currentThread().getName().equals("Checking")) {
			checking();
		}else {
			saving();
		}
	}
	
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
	
	void checking() {
		for(int i=0; i<5; i++) {
			System.out.println("Checking...");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	void saving() {
		for(int i=0; i<5; i++) {
			System.out.println("Saving...");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
