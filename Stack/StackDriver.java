/**
 * @author Stanley Wong
 *
 */
public class StackDriver {

	public static void main(String[] args) {
		
		Stack myStack = new Stack();
		myStack.push("one");
		myStack.push("two");
		myStack.push("three");
		myStack.push("four");
		myStack.push("five");
		myStack.push("six");
		
		myStack.pop();
		myStack.pop();
		
		
		System.out.println(myStack.getTopNode());		
		System.out.println(myStack.getStackSize());

		
		myStack.showStack(myStack.getTopNode());
		

	}

}
