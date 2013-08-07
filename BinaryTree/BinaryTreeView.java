import java.util.Scanner;

public class BinaryTreeView {

	public BinaryTreeView() {
		// TODO Auto-generated constructor stub
	}

	public void startView() {
		Scanner get = new Scanner(System.in);
		boolean keepRunning = true;
		BinaryTree binaryTreeModel = new BinaryTree();

		while (keepRunning == true) {
			System.out
					.println("======================\n	MENU\n======================");

			System.out
					.println("[0]: CREATE\n[1]: DESTROY\n[2]: FIND\n[3]: PRINTSORT\n[4]: PRINT\n[5]: IN_ORDER\n[6]: PRE_ORDER\n[7]: POST_ORDER\n[8]: DELETE\n[9]: INSERT\n");

			System.out.println("\nPlease Enter a Option: ");

			Options choice = Options.values()[get.nextInt()];

			System.out.println("Your choice is: " + choice);

			switch (choice) {

			case CREATE:
				binaryTreeModel.create();
				break;
			case DELETE:
				String delString = new String(get.next());
				binaryTreeModel.delete(delString);
				break;
			case DESTROY:
				binaryTreeModel.destroy();
				break;
			case FIND:
				String findString = new String(get.next());
				binaryTreeModel.find(findString);
				break;
			case INSERT:
				String insertionString = new String(get.next());
				binaryTreeModel.insert(insertionString);
				break;
			case IN_ORDER:
				binaryTreeModel.printInOrder(binaryTreeModel.getRoot());
				break;
			case POST_ORDER:
				binaryTreeModel.printPostOrder(binaryTreeModel.getRoot());
				break;
			case PRE_ORDER:
				binaryTreeModel.printPreOrder(binaryTreeModel.getRoot());
				break;
			case PRINT:
				binaryTreeModel.print();
				break;
			case PRINTSORT:
				binaryTreeModel.printSort();
				break;

			default:
				break;
			}

		}

		get.close();

	}

}
