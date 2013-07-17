/**************************************************************
 *
 * PROGRAMMER: Stanley Wong
 * FILENAME:   Node.java
 *
 * DESCRIPTION: Generic Node class to be used with Stack.java
 *           		
 **************************************************************/
public class Node<T> {
	T data;
	Node<T> nextNode;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

}
