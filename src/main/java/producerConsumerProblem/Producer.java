package producerConsumerProblem;

public class Producer extends Thread{
	Queue q = new Queue();
	public Producer(Queue q) {
		this.q = q;
	}
	
	public void run() {
		int i = 1;
		while(true)
			q.put(i++);
	}
}
