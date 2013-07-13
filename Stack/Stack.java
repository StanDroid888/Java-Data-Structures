/**
 * @author Stanley Wong
 * Class: Stack.java
 * Description: Dynamic Stack class which holds <String> types
 */
public class Stack {

	Node topNode;
	int stackSize;

	public Stack() {
		topNode = null;
		stackSize = 0;
	}

	public Node getTopNode() {
		return topNode;
	}

	public void setTopNode(Node topNode) {
		this.topNode = topNode;
	}

	public int getStackSize() {
		return stackSize;
	}

	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}

	public boolean isEmpty() {
		return (stackSize == 0 ? true : false);
	}

	public void push(String data) {

		Node newNode = new Node();
		newNode.setData(data);
		setStackSize(getStackSize() + 1);

		if (isEmpty()) {
			// stack is empty
			newNode.setNextNode(null);
			topNode = newNode;
		} else {
			// push node to the top of the stack
			newNode.setNextNode(topNode);
			topNode = newNode;
		}

		System.out.println("<< PUSH \"" + newNode.data + "\" TO STACK >>");

	}

	public Node pop() {

		Node popNode = new Node();
		popNode = getTopNode();
		setStackSize(getStackSize() - 1);

		if (isEmpty()) {
			System.out.println("Stack is EMPTY!!");
			return (null);
		} else if (stackSize == 1) {
			topNode = null;
		} else {
			topNode = topNode.getNextNode();
		}
		
		System.out.println("## POP \"" + popNode.data + "\" FROM STACK ##");		
		return (popNode);
	}

	// requires the Top of stack as parameter
	public void showStack() {

		Node current = getTopNode();

		System.out.println("\n---------------------");
		System.out.println("STACK INFO");

		while (current != null) {
			System.out.println("Node Data: " + current.data);
			current = current.nextNode;
		}

		System.out.println("<< Stack Size: " + getStackSize() + " >>");
		System.out.println("----------------------");

		/*
		 * if (current == null) {
		 * System.out.println("Bottom of Stack Reached!!");
		 * System.out.println("Stack Size:" + getStackSize()); } else {
		 * System.out.println("Node Data:" + current.data);
		 * showStack(current.getNextNode());
		 * 
		 * }
		 */

	}

}
