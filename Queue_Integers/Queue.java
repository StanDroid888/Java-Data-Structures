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

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	// Return TRUE if queue is empty
	public boolean isEmpty() {
		return (head == null && tail == null ? true : false);
	}

	public void addToQueue(Integer data) {
		// All new nodes will be added to the
		// tail of the Queue.

		Node newNode = new Node(data);
		newNode.setNextNode(null);
		queueSize++;

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
	}

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
