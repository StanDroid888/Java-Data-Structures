/**
 * @author Stanley Wong
 *  Class: LinkedList.java
 *  Description: This is a linked list class to be used with integers.
 *
 */
public class LinkedList {

	Node headNode;
	int listSize;

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
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

	/**
	 *  Method: addNodeWithValue
	 *  Description: This method will create a new node with the value specified and append 
	 *  it to the linked list.  
	 */
	public void addNodeWithValue(int value) {

		Node newNode = new Node(value);

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

	/**
	 *  Method: displayLinkedList
	 *  Description: This method display the values in the linked list via recursion. 
	 *  The data contents are printed to standard output after each recursive call.
         *  The base case is when the Node parameter is NULL signaling the end of the list.      
	 */
	public void displayLinkedList(Node currentNode) {

		if (currentNode == null) {
			System.out.print("End of List\n\n ");
			System.out.println("List size is " + listSize);
			return;
		} else {
			System.out.print(currentNode.getData() + " -> ");
			displayLinkedList(currentNode.getNextNode());
		}

	}// end displayLinkedList

	/**
	 *  Method: deleteNode()
	 *  Description: This method deletes the node at the end of the linked list. 
         *  The traversal is done iteratively until NULL is reached. 
	 */
	public void deleteNode() {
	
	Node currentNode = new Node();
	currentNode = headNode;
	
	if (listSize == 0){
		System.out.println("Empty List");
		return;}
	
	if(listSize == 1){
		currentNode = null;
		} else {

			// Stop at the end of list
			while (currentNode.getNextNode().getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}

			System.out.println("\nDELETING:" + currentNode.getNextNode());

			currentNode.setNextNode(null);

			// Decrease the size of the Linked List
			setListSize(getListSize() - 1);
		}

		return;
	}

}
