/**
 * @author Stanley Wong
 *
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
	public boolean isEmpty(){	
		return (stackSize==0 ? true : false);
	}
	
	public void push(String data) {
	
		Node newNode = new Node();
		newNode.setData(data);
		setStackSize(getStackSize()+1);

		if (isEmpty()) {
			// stack is empty
			newNode.setNextNode(null);
			topNode = newNode;
		}else{
			// push node to the top of the stack
			newNode.setNextNode(topNode);
			topNode = newNode;
		}
		
		System.out.println("<< PUSH \"" + newNode.data + "\" TO STACK >>");

	}
	
	public Node pop() {
		
		Node popOffNode = new Node();
		popOffNode = getTopNode();
		
		topNode = topNode.getNextNode();
		return (popOffNode);
	}
	
	// requires the Top of stack as parameter
	public void showStack(Node current) {

		/*
		 * while(current != null) { System.out.println("This Node has: " +
		 * current.data); current = current.nextNode; }
		 */

		if (current == null) {
			System.out.println("Bottom of Stack Reached!!");
			System.out.println("Stack Size:" + getStackSize());
		} else {
			System.out.println("Node Data:" + current.data);
			showStack(current.getNextNode());

		}

	}
	
}
