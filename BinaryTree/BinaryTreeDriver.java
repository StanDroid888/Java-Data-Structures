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
		myBinaryTree.insert("Bart");
		myBinaryTree.insert("Billy");
		myBinaryTree.insert("Wally");
		myBinaryTree.insert("Homer");
		myBinaryTree.insert("Tom");
		myBinaryTree.insert("Brady");
		myBinaryTree.insert("Dustin");
		myBinaryTree.insert("Jill");
		myBinaryTree.insert("Diane");
		myBinaryTree.insert("Shane");
		myBinaryTree.insert("Roger");
		myBinaryTree.insert("Amy");
		
		myBinaryTree.print();
		System.out.println(myBinaryTree.find("Tom"));
		myBinaryTree.printInOrder(myBinaryTree.getRoot());
		System.out.println();
		myBinaryTree.printPreOrder(myBinaryTree.getRoot());
		System.out.println();
		myBinaryTree.printPostOrder(myBinaryTree.getRoot());
		myBinaryTree.printSort();
		
		myBinaryTree.delete("Roger");
		myBinaryTree.delete("Jill");
		myBinaryTree.delete("Brady");
		myBinaryTree.delete("Wally");
		myBinaryTree.delete("Amy");
		myBinaryTree.printSort();
		
		System.out.println("\n\nProgram Ended");
	}
	
}
