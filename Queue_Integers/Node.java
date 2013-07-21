/**
 * @author Stanley Wong
 * Class: Node.java
 * Description: Node class to be used with LinkedList.java
 * This version is to be used with integer values. 
 */
public class Node {

		Integer data;
		Node nextNode;
		
		public Node() {
			super();
		}
		
		public Node(Integer data) {
			super();
			this.data = data;
			this.nextNode = null;
		}

		public Integer getData() {
			return data;
		}
		public void setData(Integer data) {
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
