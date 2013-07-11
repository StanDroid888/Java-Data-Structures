/**
 * @author Stanley Wong Class: LinkedList.java Description: This is a Generic
 *         Linked List class.
 */
public class LinkedList<Type> {

	Node<Type> headNode;
	int listSize;

	public Node<Type> getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node<Type> headNode) {
		this.headNode = headNode;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}

	public LinkedList() {

		headNode = null;
		listSize = 0;

	}

	/*
	 * Method: addNodeWithValue Description: This method creates a node with the
	 * specified value and adds it to the linked list. All insertions occur at
	 * the head of the linked list.
	 */
	public void addNodeWithValue(Type value) {

		Node<Type> newNode = new Node<Type>((Type) value);

		if (headNode == null) { // list is empty
			headNode = newNode;
			listSize = listSize + 1;
			// System.out.println(headNode);
		} else {
			// add to head
			newNode.setNextNode(headNode);
			headNode = newNode;
			listSize = listSize + 1;
			// System.out.println(headNode);
		}

	}// end addNodeWithValue

	/*
	 * Method: displayLinkedList Description: This method traverses the linked
	 * list via recursion and prints out the elements on the way.
	 */

	public void displayLinkedList(Node<Type> currentNode) {

		if (currentNode == null) {
			System.out.print("End of List\n\n ");
			System.out.println("List size is " + listSize);
			return;
		} else {
			System.out.print("(" + currentNode.getData() + ") => ");
			displayLinkedList(currentNode.getNextNode());
		}

	}// end displayLinkedList

	/*
	 * Method: deleteNode Description: This method will remove the node at the
	 * end of the linked list.
	 */

	public void deleteNode() {

		Node<Type> currentNode = new Node<Type>();
		currentNode = headNode;

		if (listSize == 0) {
			System.out.println("Empty List");
			return;
		}

		if (listSize == 1) {
			currentNode = null;
		} else {

			// Stop when at the end of list
			while (currentNode.getNextNode().getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}

			System.out.println("\n<<< DELETING:" + currentNode.getNextNode()
					+ " >>>\n");

			currentNode.setNextNode(null);

			// Decrease the size of the Linked List
			setListSize(getListSize() - 1);
		}// end else statement

		return;
	}// end of deleteNode method

}// end class LinkedList.java
