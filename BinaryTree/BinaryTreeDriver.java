/**
 * @author Stanley Wong
 * Class: BinaryTreeDriver.java
 * Description: Driver file for BinaryTree.java class
 *
 */
public class BinaryTreeDriver {

	public static void main(String[] args) {
		
		BinaryTreeDriver treeProgram = new BinaryTreeDriver();
		
		treeProgram.run();

	}

	public void run(){
		// TODO Auto-generated method stub
		BinaryTree myBinaryTree = new BinaryTree();
		
		myBinaryTree.insert("Manny");
		myBinaryTree.insert("Bill");
		myBinaryTree.insert("Billy");
		myBinaryTree.insert("Wally");
		myBinaryTree.insert("Bill");
		myBinaryTree.insert("Tom");
		/*myBinaryTree.insert("Tom");
		myBinaryTree.insert("Brady");
		myBinaryTree.insert("Dustin");
		myBinaryTree.insert("Jake");
		myBinaryTree.insert("Billy");
		myBinaryTree.insert("Tom");
		myBinaryTree.insert("Shane");
		myBinaryTree.insert("Roger");*/
		
		System.out.println(myBinaryTree.getRoot().toString());
		
		System.out.println("Program Ended");
	}
	
}
