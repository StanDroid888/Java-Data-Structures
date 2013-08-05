public class BinaryTree {

	Node root;

	public Node getRoot() {
		return root;
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
	 * This method adds a Node to the Binary Tree.
	 * 
	 * @param insertionString
	 * @return
	 */
	public boolean insert(String insertionString) {

		/*
		 * Local Variables
		 */
		boolean isInserted = false;
		Node currentNode = null;

		/*
		 * Check if ROOT has been set yet. If it has, then set the current Node
		 * to be ROOT to get started.
		 */
		if (root != null) {
			currentNode = getRoot();
		} else {
			currentNode = root = new Node(insertionString);
			isInserted = true;
		}

		/*
		 * Look for where to insert the new Node while isInserted is not TRUE.
		 */
		while (!isInserted) {

			/*
			 * Condition where insertion string is LESS than the current Node's
			 * string value.
			 */
			if (currentNode.getData().compareToIgnoreCase(insertionString) > 0) {

				if (currentNode.getLeftChild() == null) {
					currentNode.setLeftChild(new Node(insertionString));
					isInserted = true;
				} else {
					currentNode = currentNode.getLeftChild();
				}

			}
			/*
			 * Condition where insertion string is GREATER than the current
			 * Node's string value.
			 */
			else if (currentNode.getData().compareToIgnoreCase(insertionString) < 0) {

				if (currentNode.getRightChild() == null) {
					currentNode.setRightChild(new Node(insertionString));
					isInserted = true;
				} else {
					currentNode = currentNode.getRightChild();
				}
			}
			/*
			 * Condition where insertion string is EQUAL than the current Node's
			 * string value.
			 */
			else if (currentNode.getData().compareToIgnoreCase(insertionString) == 0) {
				currentNode.setRightChild(new Node(insertionString));
				isInserted = true;
			}
			/*
			 * None of the expected conditions reached (Error)
			 */
			else {
				System.out.println("Node Insertion Error:" + currentNode);
				isInserted = false;
			}

		}// end while loop

		/*
		 * Return boolean value
		 */
		return isInserted;

	}// end insert() method

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}

}
