
public class BinaryTreeDriver {

	public static void main(String[] args) {
		
		BinaryTreeDriver treeProgram = new BinaryTreeDriver();
		
		treeProgram.run();

	}

	public void run(){
		// TODO Auto-generated method stub
		BinaryTree myBinaryTree = new BinaryTree();
		
		myBinaryTree.insert("M");
		myBinaryTree.insert("B");
		myBinaryTree.insert("W");
		myBinaryTree.insert("T");
		myBinaryTree.insert("B");
		myBinaryTree.insert("D");
		myBinaryTree.insert("J");
		/*myBinaryTree.insert("Dustin Pediroa");
		myBinaryTree.insert("Carlos Quintania");
		myBinaryTree.insert("Johnathan Papalbon");
		myBinaryTree.insert("Roger Clemens");
		myBinaryTree.insert("Shane Victorino");
		myBinaryTree.insert("Will Clark")*/;
		
		System.out.println(myBinaryTree.getRoot().toString());
		
		System.out.println("Program Ended");
	}
	
}
