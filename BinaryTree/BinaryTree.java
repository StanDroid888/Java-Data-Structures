/**
 * Programmer: Stanley Wong 
 * Class: BinaryTree.java 
 * Description: This class is an implementation of an Binary Tree.
 * 
 */
public class BinaryTree {

	/*
	 * Attributes
	 */
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

	/*
	 * This method initializes a Binary Tree.
	 */
	public void create() {
		this.root = null;
	}

	/*
	 * This method empties a Binary Tree by setting the Root Node to null and
	 * letting the Garbage Collector clean it up.
	 */
	public void destroy() {
		this.root = null;
	}

	public boolean find(String findString) {

		/*
		 * Local Variables
		 */
		boolean isFound = false;
		Node currentNode = null;

		/*
		 * Check if ROOT has been set yet. If it has, then set the current Node
		 * to be ROOT to get started.
		 */
		if (root != null) {

			currentNode = getRoot();
		} else {
			System.out.println("Tree Empty, can't do find()");
		}

		/*
		 * Look for where to insert the new Node while isInserted is not TRUE.
		 */
		while (!isFound) {

			if (currentNode.getData().compareToIgnoreCase(findString) == 0) {
				//System.out.println("Found Node with value: " + findString);
				isFound = true;
			} else if (currentNode.getData().compareToIgnoreCase(findString) > 0) {
				currentNode = currentNode.getLeftChild();
			} else if (currentNode.getData().compareToIgnoreCase(findString) < 0) {
				currentNode = currentNode.getRightChild();
			}

		}// end while loop

		/*
		 * Return boolean value
		 */
		return isFound;
	}

	/*
	 * This method will print out the Binary Tree in a sorted order.
	 */
	public void printSort() {
		System.out.println("\n\nSorted Values: ");
		printInOrder(getRoot());
		System.out.println();
	}

	/*
	 * This method prints Binary Tree information to standard output.
	 */
	public void print() {
		System.out.println(getRoot().toString());

	}

	/**
	 * This method prints the Binary Tree via In-Order Traversal.
	 * 
	 * @param currentNode
	 */
	public void printInOrder(Node currentNode) {

		if (currentNode == null) {
			// System.out.println(": In Order");
			return;
		} else {

			printInOrder(currentNode.getLeftChild());
			System.out.print(currentNode.getData() + ", ");
			printInOrder(currentNode.getRightChild());
		}

	}

	/**
	 * This method prints the Binary Tree via Pre-Order Traversal.
	 * 
	 * @param currentNode
	 */
	public void printPreOrder(Node currentNode) {

		if (currentNode == null) {
			System.out.println(": Pre Order");
			return;
		} else {

			System.out.print(currentNode.getData() + ", ");
			printInOrder(currentNode.getLeftChild());
			printInOrder(currentNode.getRightChild());
		}

	}

	/**
	 * This method prints the Binary Tree via Post-Order Traversal.
	 * 
	 * @param currentNode
	 */
	public void printPostOrder(Node currentNode) {

		if (currentNode == null) {
			System.out.println(": Post Order");
			return;
		} else {
			printInOrder(currentNode.getLeftChild());
			printInOrder(currentNode.getRightChild());
			System.out.print(currentNode.getData() + " ");
		}

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
				/*
				 * Add a repeated value as a right child to the Node where the
				 * value first appears if the right child slot is open.
				 */
				if (currentNode.getRightChild() == null) {
					currentNode.setRightChild(new Node(insertionString));
					isInserted = true;
				}
				/*
				 * Condition where a right child exist already The right child
				 * will be swapped with a Node that contains the repeated value
				 * in this case.
				 */
				else {

					Node tempNode = new Node(insertionString);

					tempNode.setRightChild(currentNode.getRightChild());
					currentNode.setRightChild(tempNode);
					isInserted = true;
				}

			}
			/*
			 * None of the expected conditions reached (Error)
			 */
			else {
				System.out.println("Node Insertion Error:" + currentNode);
				isInserted = false;
				break;
			}

		}// end while loop

		/*
		 * Return boolean value
		 */
		return isInserted;

	}// end insert() method

	/*
	 * This method will delete a Node with a specified value.
	 */
	public void delete(String delString) {

		boolean isDeleted = false;
		Node currentNode = getRoot();
		Node previousNode = getRoot();

		/*
		 * Check to see if Node to delete is actually in the Binary Tree.
		 */
		if (find(delString)) {

			/*
			 * When the Node to delete is found, replace the deleted Node with
			 * the Right Child Node based on information from the previous Node.
			 * Otherwise, keep on searching.
			 */
			while (!isDeleted) {

				/*
				 * Node to delete is found. Also, check for repeat values. Only
				 * Delete the repeat value which was most recently added.
				 */
				if ((currentNode.getData().compareToIgnoreCase(delString) == 0)) {

					/*
					 * Inform that Node is about to be deleted from the Binary
					 * Tree.
					 */
					System.out.println("\n\nDeleting Node with value: "
							+ delString);

					/*
					 * Determine if the Node is being deleted from the left or
					 * right of the previous Node. Afterwards, replace
					 */
					if (previousNode.getData().compareToIgnoreCase(delString) > 0) {
						previousNode.setLeftChild(currentNode.getRightChild());
					} else {
						previousNode.setRightChild(currentNode.getRightChild());
					}

					/*
					 * Delete currentNode and update boolean.
					 */
					currentNode = null;
					isDeleted = true;
				}
				/*
				 * Continue Searching on Left delString is less
				 */
				else if (currentNode.getData().compareToIgnoreCase(delString) > 0) {
					previousNode = currentNode;
					currentNode = currentNode.getLeftChild();
				}
				/*
				 * Continue Searching on Right delString is greater
				 */
				else if (currentNode.getData().compareToIgnoreCase(delString) < 0) {
					previousNode = currentNode;
					currentNode = currentNode.getRightChild();
				}
				/*
				 * Repeated Value Encountered
				 */
				else if (previousNode.getData().compareToIgnoreCase(delString) == 0) {
					System.out.println("REPEAT VALUE");
					previousNode = currentNode;
				}

			}// end while loop

		} else {
			/*
			 * The Node to be deleted is NOT a Binary Tree Element.
			 */
			System.out.println("The string " + delString
					+ " is NOT in the Binary Tree.");
		}

		return;
	}// End delete()

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}

}
