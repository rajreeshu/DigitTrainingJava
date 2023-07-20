package producerConsumerProblem;

public class Consumer extends Thread{
	Queue b = new Queue();
	public Consumer(Queue q) {
		b = q;
	}
	
	public void run() {
		while(true)
			b.get();
	}
}
