/**
 * @author Stanley Wong Class: Stack.java Description: Generic Version of
 *         Dynamic Stack
 */
public class Stack<T> {

	Node<T> topNode;
	int stackSize;

	public Stack() {
		topNode = null;
		stackSize = 0;
	}

	public Node<T> getTopNode() {
		return topNode;
	}

	public void setTopNode(Node<T> topNode) {
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

	public void clearStack() {

		Node<T> current = getTopNode();

		while (current != null) {
			pop();
			current = current.nextNode;
		}

		System.out.println("\n*****************");
		System.out.println(" STACK CLEARED!! ");
		System.out.println("*****************");
	}

	public void push(T data) {

		Node<T> newNode = new Node<T>();
		newNode.setData((T) data);
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

	public Node<T> pop() {

		Node<T> popNode = new Node<T>();
		popNode = getTopNode();

		if (isEmpty()) {
			System.out.println("Stack is EMPTY!!");
			return (null);
		} else if (stackSize == 1) {
			topNode = null;
		} else {
			topNode = topNode.getNextNode();
		}

		System.out.println("## POP \"" + popNode.data + "\" FROM STACK ##");

		// Decrease Stack Size
		setStackSize(getStackSize() - 1);
		return (popNode);
	}

	// requires the Top of stack as parameter
	public void showStack() {

		Node<T> current = getTopNode();

		System.out.println("\n---------------------");
		System.out.println("STACK INFO");

		while (current != null) {
			System.out.println("Node Data: " + current.data);
			current = current.nextNode;
		}

		System.out.println("<< Stack Size: " + getStackSize() + " >>");
		System.out.println("----------------------");

	}

}// end Stack.java