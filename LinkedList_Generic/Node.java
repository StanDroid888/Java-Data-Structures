/**
 * @author Stanley Wong
 * Class: Node.java
 * Description: This class is a generic for a Node used with the LinkedList class. 
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
