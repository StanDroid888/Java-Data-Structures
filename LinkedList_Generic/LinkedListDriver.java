/**
 * @author Stanley Wong
 * Generic Version of Linked List
 */
public class LinkedListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> List = new LinkedList();
		
		
		for (int i = 1; i <= 10; i++) {

			List.addNodeWithValue(Integer.toString(i) + " Node");
			System.out.println("\nAdded Node to list with value: " + i);
		}
		
		//System.out.println(List.getHeadNode());
		System.out.println("\n----------------------------------------------------------------");
		System.out.println("LINKED LIST VALUES");
		System.out.println("----------------------------------------------------------------\n");

		List.displayLinkedList(List.getHeadNode());
		List.deleteNode();
		List.deleteNode();
		List.addNodeWithValue("HAHA");
		
		List.displayLinkedList(List.getHeadNode());
	}

}
