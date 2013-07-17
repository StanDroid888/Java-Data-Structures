/**************************************************************
 * 
 * PROGRAMMER: Stanley Wong FILENAME: Stack.java
 * 
 * DISCRIPTION: Generic Dynamic Stack (requires Node.java)
 * 
 **************************************************************/
public class Stack<T> {

	Node<T> topNode;
	int stackSize;

	/**
	 * Constructor
	 * 
	 */
	public Stack() {
		topNode = null;
		stackSize = 0;
	}

	/**
	 * This method will return the top node of the stack.
	 * 
	 */
	public Node<T> getTopNode() {
		return topNode;
	}

	/**
	 * This method will set the topNode.
	 * 
	 */
	public void setTopNode(Node<T> topNode) {
		this.topNode = topNode;
	}

	/**
	 * This method will return the number of elements currently in the stack
	 * 
	 */
	public int getStackSize() {
		return stackSize;
	}

	/**
	 * This method will be used to update the element stack counter.
	 * 
	 */
	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}

	/**
	 * This method will return a boolean to signal if a stack is empty or not.
	 * 
	 */
	public boolean isEmpty() {
		return (stackSize == 0 ? true : false);
	}

	/**
	 * This method will clear the stack by popping off all of the elements in
	 * the stack.
	 * 
	 */
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

	/**
	 * This method add an element at the top of the stack. When called, a new
	 * Node object is created and set with the data provided in the arguments.
	 * 
	 */
	public void push(T data) {

		Node<T> newNode = new Node<T>();
		newNode.setData((T) data);
		setStackSize(getStackSize() + 1);

		/*
		 * Two special cases for a push() are a empty stack or a stack with
		 * elements already in it.
		 */
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

	/**
	 * This method removes an element from the top of the stack. When called, a
	 * Node with the copy of the popped off node is returned.
	 * 
	 */
	public Node<T> pop() {

		Node<T> popNode = new Node<T>();
		popNode = getTopNode();

		/*
		 * Three special cases for a pop() are a empty stack, only one node at
		 * the top and a stack with multiple elements.
		 */
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

	/**
	 * This method show the contents of the stack.
	 * 
	 */
	public void showStack() {

		/*
		 * Traverse the stack by starting at the top node and then get to the
		 * next node by setting to current node "pointer" to the next node until
		 * Null is reached.
		 */
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