/**
 * @author Stanley Wong
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

	public void displayLinkedList(Node currentNode) {

		// System.out.println("\n------------------------\ndisplayed called");

		/*
		 * while(currentNode != null){ System.out.print(currentNode.getData() +
		 * " -> "); currentNode = currentNode.getNextNode(); }
		 * 
		 * System.out.println(" null");
		 */

		if (currentNode == null) {
			System.out.print("End of List\n\n ");
			System.out.println("List size is " + listSize);
			return;
		} else {
			System.out.print(currentNode.getData() + " -> ");
			displayLinkedList(currentNode.getNextNode());
		}

	}// end displayLinkedList

	public void deleteNode() {
	
	Node currentNode = new Node();
	currentNode = headNode;
	
	if (listSize == 0){
		System.out.println("Empty List");
		return;}
	
	if(listSize == 1){
		currentNode = null;
		} else {

			// Gonna stop when at the end of list
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
