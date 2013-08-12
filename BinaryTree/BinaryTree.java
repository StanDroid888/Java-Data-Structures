/**
 * Programmer: Stanley Wong
 * 
 * Class: BinaryTree.java
 * 
 * Description: Implementation of an Binary Tree.
 * 
 */
public class BinaryTree {

	/**
	 * Attributes
	 */
	Node root;

	/**
	 * Constructor
	 */
	public BinaryTree() {
		this.root = null;
	}

	/**
	 * Alternative Constructor
	 */
	public BinaryTree(String rootValue) {
		this.root = new Node(rootValue);
	}

	/**
	 * Root getter method
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * This method initializes a Binary Tree.
	 */
	public void create() {
		this.root = null;
	}

	/**
	 * This method empties a Binary Tree by setting the Root Node to null and
	 * lets the Garbage Collector clean it up.
	 */
	public void destroy() {
		this.root = null;
	}

	/**
	 * This method returns a boolean based on whether or not a Node with a
	 * particular String value exist in the Binary Tree.
	 * 
	 * @param findString
	 * @return
	 */
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
			if (currentNode == null) {
				break;
			} else if (currentNode.getData().compareToIgnoreCase(findString) == 0) {
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

	/**
	 * This method will print out the Binary Tree in a sorted order.
	 */
	public void printSort() {
		System.out.println("\n\nSorted Values: ");
		printInOrder(getRoot());
		System.out.println();
	}

	/**
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
			System.out.print(currentNode.getData() + "\t");
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

			System.out.print(currentNode.getData() + "\t");
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
			System.out.print(currentNode.getData() + "\t");
		}

	}

	/**
	 * This method adds a Node to the Binary Tree.
	 * 
	 * @param insertionString
	 * @return isInserted
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
			 * Condition where insertion string is EQUAL to the current Node's
			 * string value.
			 */
			else if (currentNode.getData().compareToIgnoreCase(insertionString) == 0) {
				/*
				 * Check to see if the requested String to be inserted is
				 * already in the Binary Search Tree. The Binary Search Tree
				 * should not have duplicate key values. Insertion will only
				 * occur if the request is to add a new element onto the Binary
				 * Search Tree.
				 */
				System.out.println("DUPLICATE VALUE \"" + insertionString
						+ "\" can't be added to Binary Search Tree.");
				isInserted = false;
				break;

			} else {
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

	/**
	 * This method will delete a Node with a specified value.
	 * 
	 * @param delString
	 * @return isDeleted
	 */
	public void delete(String delString) {

		boolean isDeleted = false;
		Node currentNode = getRoot();
		Node previousNode = getRoot();

		/*
		 * Check to see if Node to delete is the ROOT Node.
		 */
		if ((root.getData().compareToIgnoreCase(delString) == 0)) {

			/*
			 * Check if root is the only Node on the tree
			 */
			if (root.getLeftChild() == null && root.getRightChild() == null) {
				destroy();
				System.out.println("Tree has been re-initalized.");
			}
			/*
			 * Set the ROOT data to the data in the left most (minimum) Node of
			 * the right subtree.
			 */
			else {
				root.setData(findMin(root.getRightChild()));
				root.setRightChild(root.getRightChild().getRightChild());
				System.out.println("ROOT NODE deletion. New ROOT value is now "
						+ root.getData());
			}
		}
		/*
		 * Standard Deletion of Node which is not ROOT
		 */
		else if (find(delString)) {

			/*
			 * When the Node to delete is found, replace the deleted Node with
			 * the Right Child Node based on information from the previous Node.
			 * Otherwise, keep on searching.
			 */
			while (!isDeleted) {

				if ((currentNode.getData().compareToIgnoreCase(delString) == 0)) {

					/*
					 * Inform the user that the Node to be deleted has been
					 * found and is about to be deleted from the Binary Search
					 * Tree.
					 */
					System.out.println("\n\nDeleting Node with value: "
							+ delString);

					/*
					 * Determine if the Node is being deleted from the left or
					 * right of the previous Node. Also, determine the type of
					 * deletion based on the number of children of the Node to
					 * be removed.
					 */
					if (previousNode.getData().compareToIgnoreCase(delString) > 0) {

						/*
						 * Delete Node with no children
						 */
						if (currentNode.getLeftChild() == null
								&& currentNode.getRightChild() == null) {
							previousNode.setLeftChild(null);
						}
						/*
						 * Delete Node with only one child on the Left
						 */
						else if (currentNode.getLeftChild() != null
								&& currentNode.getRightChild() == null) {
							previousNode.setLeftChild(currentNode
									.getLeftChild());
						}
						/*
						 * Delete Node with only one child on the Right
						 */
						else if (currentNode.getLeftChild() == null
								&& currentNode.getRightChild() != null) {
							previousNode.setLeftChild(currentNode
									.getRightChild());

						}
						/*
						 * Delete Node with two children
						 */
						else if (currentNode.getLeftChild() != null
								&& currentNode.getRightChild() != null) {

							/*
							 * Replace the currentNode data with the data of the
							 * left most (minimum) value of the subtree.
							 */
							while (currentNode.getLeftChild() != null) {
								previousNode = currentNode;
								currentNode = currentNode.getLeftChild();
							}
							currentNode.setData(findMin(currentNode));
							previousNode.setLeftChild(null);

						}

					}
					/*
					 * Process other side instead
					 */
					else if (previousNode.getData().compareToIgnoreCase(
							delString) < 0) {
						/*
						 * Delete Node with no children
						 */
						if (currentNode.getLeftChild() == null
								&& currentNode.getRightChild() == null) {
							previousNode.setRightChild(null);
						}
						/*
						 * Delete Node with only one child on the Left
						 */
						else if (currentNode.getLeftChild() != null
								&& currentNode.getRightChild() == null) {
							previousNode.setRightChild(currentNode
									.getLeftChild());
						}
						/*
						 * Delete Node with only one child on the Right
						 */
						else if (currentNode.getLeftChild() == null
								&& currentNode.getRightChild() != null) {
							previousNode.setRightChild(currentNode
									.getRightChild());

						}
						/*
						 * Delete Node with two children
						 */
						else if (currentNode.getLeftChild() != null
								&& currentNode.getRightChild() != null) {

							/*
							 * Replace the currentNode data with the data of the
							 * left most (minimum) value of the subtree.
							 */
							while (currentNode.getLeftChild() != null) {
								previousNode = currentNode;
								currentNode = currentNode.getLeftChild();
							}

							currentNode.setData(findMin(currentNode));
							previousNode.setLeftChild(null);

						}
					}
					/*
					 * Delete update boolean.
					 */
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

	/**
	 * This methods finds the minimum value in the Binary Search Tree
	 * 
	 * @return currentNode
	 */
	private String findMin(Node currentNode) {

		while (currentNode.getLeftChild() != null) {
			currentNode = currentNode.getLeftChild();
		}

		System.out.println("Minium Value of Binary Tree is "
				+ currentNode.getData());

		return currentNode.getData();

	}

	/**
	 * This methods finds the maxium value in the Binary Search Tree
	 * 
	 * @return currentNode
	 */
	public Node findMax(Node currentNode) {

		while (currentNode.getRightChild() != null) {
			currentNode = currentNode.getRightChild();
		}

		System.out.println("Maximum Value of Binary Tree is "
				+ currentNode.getData());

		return currentNode;

	}

	/**
	 * This method creates a informational String about the Binary Tree.
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}

}// End BinaryTree.java class
