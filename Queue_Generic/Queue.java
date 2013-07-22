/**
 * @author Stanley Wong Generic version of a Dynamic Queue. Node.java is
 *         required for this class.
 * 
 */
public class Queue<T> {

	int queueSize;
	Node<T> head;
	Node<T> tail;

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

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	/**
	 * checks to see if a Queue is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return (queueSize == 0 ? true : false);
	}

	/**
	 * This method is used to add a new item to the queue with the data provided
	 * in the parameters. All additions will be done at the tail of the queue.
	 * 
	 * @param data
	 */
	public void addToQueue(T data) {
		// All new nodes will be added to the
		// tail of the Queue.

		Node<T> newNode = new Node<T>();
		
		newNode.setData(data);
		newNode.setNextNode(null);

		if (isEmpty()) {
			// This will be the only Node in the Queue.
			// Thus it will be the Head and the Tail.
			System.out.println("ADDING first Node with value of:"
					+ newNode.getData());
			head = tail = newNode;

		} else if (1 == getQueueSize()) {
			// Queue size of one presents a special case
			System.out.println("ADDING second Node with value of: "
					+ newNode.getData());

			head.setNextNode(newNode);
			tail = newNode;

		} else {
			// Standard add of Node
			System.out.println("ADDING Node with value of: "
					+ newNode.getData());

			tail.setNextNode(newNode);
			tail = newNode;

		}

		// Increase the Queue Size by one.
		queueSize++;
	}

	/**
	 * This method removes an item from the head of the Queue. A soft copy of
	 * the Node will be returned.
	 * 
	 * @return
	 */
	public Node<T> removeFromQueue() {

		Node<T> deletedNode = new Node<T>();

		// Set the data in the return node with
		// what is currently in the head node;
		deletedNode.setData(getHead().getData());

		// Now set the head node to head->next
		// so that the garbage collector will
		// get rid of the node originally at the
		// head of the queue;
		head = head.getNextNode();

		// Decrease the size of the Queue
		queueSize--;

		return (deletedNode);
	}

	/**
	 * This method displays the queue in a list format to standard output.
	 */
	public void showQueue() {

		Node<T> currentNode = getHead();
		System.out.println("\nQUEUE SIZE: " + queueSize);
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

	/**
	 * This method will remove all the elements from the Queue.
	 */
	public void clearQueue() {

		while (!isEmpty()) {
			removeFromQueue();
		}

		System.out.println("QUEUE CLEARED");

	}

	@Override
	public String toString() {
		return "Queue [queueSize=" + queueSize + ", head=" + head + ", tail="
				+ tail + "]";
	}

}
