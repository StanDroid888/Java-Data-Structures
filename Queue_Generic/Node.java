/**
 * @author Stanley Wong Class: Node.java Description: Node class to be used with
 *         Queue.java This version is to be used with integer values
 */
public class Node<T> {

	T data;
	Node<T> nextNode;

	public Node() {
		super();
	}

	public Node(T data) {
		super();
		this.data = data;
		this.nextNode = null;
	}

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

	@Override
	public String toString() {
		return "Node [data=" + data + ", nextNode=" + nextNode + "]";
	}

}
