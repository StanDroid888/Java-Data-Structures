public class BinaryTree {

	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(String rootString) {
		this.root.setData(rootString);
	}

	public BinaryTree() {
		this.root = null;
	}

	public BinaryTree(String rootValue) {
		this.root = new Node(rootValue);
	}

	public void create() {

	}

	public void destroy() {

	}

	public boolean find(String searchString) {
		return false;

	}

	public void printSort() {

	}

	public void print() {

	}

	public void printInOrder() {

	}

	public void printPreOrder() {

	}

	public void printPostOrder() {

	}

	public void delete(String delString) {

	}
	

	/** 
	 * This method adds a Node to the
	 * Binary Tree.
	 * @param insertionString
	 * @return
	 */
	public boolean insert(String insertionString) {

		/*
		 * Start at Root
		 */
		Node currentNode = getRoot();

		/*
		 * Initialize return value to false.
		 */
		boolean isInserted = false;

		/*
		 * Look for where to insert the new
		 * Node while isInserted is not TRUE.
		 */
		while (!isInserted) {

			if (currentNode == null) {

				currentNode = new Node(insertionString);
				isInserted = true;

			} else if (currentNode.getData().compareToIgnoreCase(
					insertionString) < 0) {

				currentNode = currentNode.getLeftChild();

			} else if (currentNode.getData().compareToIgnoreCase(
					insertionString) > 0) {

				currentNode = currentNode.getRightChild();

			} else {

				currentNode = currentNode.getRightChild();

			}

		}
		return isInserted;

	}

}
