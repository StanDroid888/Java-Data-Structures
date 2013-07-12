/**
 * @author Stanley Wong
 * Class: Node.java
 * Description: Node class to be used with LinkedList.java
 * This version is to be used with int (primative) values. 
 */
public class Node {

		int data;
		Node nextNode;
		
		public Node() {
			super();
		}
		
		public Node(int data) {
			super();
			this.data = data;
			this.nextNode = null;
		}

		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNextNode() {
			return nextNode;
		}
		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
		
		@Override
		public String toString() {
			return "Node [data=" + data + ", nextNode=" + nextNode + "]";
		}
		
}
