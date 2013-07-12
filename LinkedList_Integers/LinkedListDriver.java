/**
 * @author Stanley Wong
 * Class: LinkedListDriver.java
 * Description: This class is a driver for the LinkedList (Int) class.
 */
public class LinkedListDriver {

	public static void main(String[] args) {
		
		LinkedList List = new LinkedList();
		
		for (int i = 1; i <= 10; i++) {

			List.addNodeWithValue(i);
			System.out.println("\nAdded Node to list with value: " + i);
		}
		
		//System.out.println(List.getHeadNode());
		System.out.println("\n----------------------------------------------------------------");
		System.out.println("LINKED LIST VALUES");
		System.out.println("----------------------------------------------------------------\n");

		List.displayLinkedList(List.getHeadNode());
		List.deleteNode();
		List.deleteNode();
		List.deleteNode();
		List.deleteNode();
		List.deleteNode();
		List.deleteNode();
		

		List.displayLinkedList(List.getHeadNode());
	}

}
