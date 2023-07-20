package producerConsumerProblem;

public class Queue{
	int x;
	void put(int a) {
		System.out.println("Producer Produced "+a);
		x=a;
	}
	void get() {
		System.out.println("Consumer Consumed "+x);
	}
}
