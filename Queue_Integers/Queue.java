/**
 * @author Stanley Wong
 * This class is a implementation of a Dynamic Queue.
 * Node.java is required for this class.  
 *
 */
public class Queue {

	int queueSize;
	Node head;
	Node tail;

	public Queue() {
		queueSize = 0;
		head = tail = null;
	}

	public int getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(int queueSize) {
		this.queueSize = queueSize;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	/**
	 * checks to see if a Queue is empty. 
	 * @return
	 */
	public boolean isEmpty() {
		return (head == null && tail == null && this.queueSize==0 ? true : false);
	}

	/**
	 * This method is used to add a new item to the queue with the 
	 * data provided in the parameters. All additions will be done 
	 * at the tail of the queue. 
	 * @param data
	 */
	public void addToQueue(Integer data) {
		// All new nodes will be added to the
		// tail of the Queue.

		Node newNode = new Node(data);
		newNode.setNextNode(null);
		

		if (isEmpty()) {
			// This will be the only Node in the Queue.
			// Thus it will be the Head and the Tail.
			System.out.println("adding first node");
			head = tail = newNode;

		} else if (1 == getQueueSize()) {
			// Queue size of one presents a special case
			System.out.println("adding second node");

			head.setNextNode(newNode);
			tail = newNode;

		} else {
			// Standard add of Node
			System.out.println("adding 3rd node");

			tail.setNextNode(newNode);
			tail = newNode;

		}
		
		// Increase the Queue Size by one.
		queueSize++;
	}

	
	/**
	 * This method removes an item from the head of the Queue. 
	 * A soft copy of the Node will be returned. 
	 * @return
	 */
	public Node removeFromQueue() {
		
		Node deletedNode = new Node(); 
		
		// Set the data in the return node with
		// what is currently in the head node;
		deletedNode.setData(getHead().getData());
		
		// Now set the head node to head->next
		// so that the garbage collector will 
		// get rid of the node originally at the
		// head of the queue;
		head = getHead().getNextNode();	
		
		return(deletedNode);
	}
	
	/**
	 * This method displays the queue in a list format
	 * to standard output. 
	 */
	public void showQueue() {

		Node currentNode = getHead();
		System.out.print("(HEAD):");

		while (null != currentNode) {
			if (currentNode.getNextNode() == null) {
				System.out.println("(TAIL):" + currentNode.getData());
			} else {
				System.out.print(currentNode.getData() + " -> ");
			}
			// Increment pointer to next Node
			currentNode = currentNode.getNextNode();
		}
	}

	@Override
	public String toString() {
		return "Queue [queueSize=" + queueSize + ", head=" + head + ", tail="
				+ tail + "]";
	}

}
