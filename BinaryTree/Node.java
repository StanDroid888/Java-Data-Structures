/**
 * @author Stanley Wong
 * Class: Node.java
 * Description: Node class to be used with BinaryTree.java
 * 
 */
public class Node {

		String data;
		Node leftChild;
		Node rightChild;
		
		public Node() {
			this.data = "";
			this.leftChild = null;
			this.rightChild = null; 
		}
		
		public Node(String stringValue) {
			this.data = stringValue;
			this.leftChild = null;
			this.rightChild = null; 
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getLeftChild() {
			return leftChild;
		}

		public void setLeftChild(Node leftChild) {
			this.leftChild = leftChild;
		}

		public Node getRightChild() {
			return rightChild;
		}

		public void setRightChild(Node rightChild) {
			this.rightChild = rightChild;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", leftChild=" + leftChild
					+ ", rightChild=" + rightChild + "]";
		}
}
