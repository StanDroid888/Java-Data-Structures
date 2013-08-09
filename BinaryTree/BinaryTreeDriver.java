/**
 * @author Stanley Wong
 * Class: BinaryTreeDriver.java
 * Description: Driver file for BinaryTree.java class
 *
 */
public class BinaryTreeDriver {

	public static void main(String[] args) {
		
		BinaryTreeDriver treeProgram = new BinaryTreeDriver();
		
		treeProgram.runDriver();
		//treeProgram.runView();
		
	}
	public void runView(){
		
		BinaryTreeView view = new BinaryTreeView();
		view.startView();
		
	}

	public void runDriver(){
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
		myBinaryTree.printSort();
		
		myBinaryTree.delete("Manny");
		myBinaryTree.delete("Diane");
		myBinaryTree.delete("Jill");
		myBinaryTree.delete("Homer");
		myBinaryTree.delete("Brady");
		myBinaryTree.delete("Roger");
		myBinaryTree.delete("Amy");		
		myBinaryTree.printSort();

		
		 
		
		System.out.println("\n\nProgram Ended");
	}
	
}
