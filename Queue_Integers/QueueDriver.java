
public class QueueDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue TestQueue = new Queue();
		TestQueue.addToQueue(1);
		TestQueue.addToQueue(2);
		TestQueue.addToQueue(3);
		TestQueue.addToQueue(4);
		TestQueue.addToQueue(5);
		TestQueue.addToQueue(6);
		
		System.out.println("Node with value: " + TestQueue.removeFromQueue().getData() +" removed.");
		
		TestQueue.showQueue();
	}

}
