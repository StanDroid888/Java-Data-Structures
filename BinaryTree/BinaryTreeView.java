import java.util.Scanner;

/**
 * Programmer: Stanley Wong
 * 
 * Class: BinaryTreeView.java
 * 
 * Description: This is the View file for the menu-driven user interface.
 * 
 */
public class BinaryTreeView {

	public BinaryTreeView() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method kicks off the View. The view provides a menu of options for
	 * the user to interact with the Binary Tree (Model)
	 */
	public void startView() {
		Scanner get = new Scanner(System.in);
		boolean keepRunning = true;
		BinaryTree binaryTreeModel = new BinaryTree();
		System.out
				.println("=============================\n Stan\'s Binary Tree Program\n=============================\n");

		/*
		 * Keep looping until user request to quit.
		 */
		while (keepRunning == true) {
			System.out
					.println("======================\n	MENU\n======================");

			System.out
					.println("[0]: CREATE\n[1]: DESTROY\n[2]: INSERT\n[3]: PRINTSORT\n[4]: PRINT\n[5]: IN_ORDER\n[6]: PRE_ORDER\n[7]: POST_ORDER\n[8]: DELETE\n[9]: FIND\n[10]: QUIT\n");

			System.out.println("\nPlease Enter a Option: ");

			/*
			 * Get user input as integer and translate into Options (ENUM)
			 * value.
			 */
			int enumValue = get.nextInt();
			Options choice;

			/*
			 * Check if user input is within range. If it is not, set the choice
			 * value to UNKNOWN.
			 */
			if (enumValue > Options.values().length - 1) {
				choice = Options.UNKNOWN;
			} else {
				choice = Options.values()[enumValue];
			}

			/*
			 * Output choice info to user.
			 */
			System.out.println("\nREQUEST: " + choice);
			System.out.println();

			/*
			 * Process user input
			 */
			switch (choice) {

			case CREATE:
				binaryTreeModel.create();
				System.out.println("Tree Initalized...");
				break;
			case DELETE:
				System.out.println("Please enter string value to DELETE:");
				String delString = new String(get.next());
				binaryTreeModel.delete(delString);
				break;
			case DESTROY:
				binaryTreeModel.destroy();
				System.out.println("Tree has been deleted.");
				break;
			case FIND:
				System.out.println("Please enter string value to FIND:");
				String findString = new String(get.next());
				binaryTreeModel.find(findString);
				System.out.println("Value is in tree: "
						+ binaryTreeModel.find(findString));
				System.out.println();
				System.out.println();
				break;
			case INSERT:
				System.out.println("Please enter string value to INSERT:");
				String insertionString = new String(get.next());
				binaryTreeModel.insert(insertionString);
				break;
			case IN_ORDER:
				System.out.println("=== In Order Traversal ===");
				binaryTreeModel.printInOrder(binaryTreeModel.getRoot());
				System.out.println();
				System.out.println();
				break;
			case POST_ORDER:
				System.out.println("=== Post Order Traversal ===");
				binaryTreeModel.printPostOrder(binaryTreeModel.getRoot());
				System.out.println();
				System.out.println();
				break;
			case PRE_ORDER:
				System.out.println("=== Pre Order Traversal ===");
				binaryTreeModel.printPreOrder(binaryTreeModel.getRoot());
				System.out.println();
				System.out.println();
				break;
			case PRINT:
				binaryTreeModel.print();
				System.out.println();
				System.out.println();
				break;
			case PRINTSORT:
				binaryTreeModel.printSort();
				System.out.println();
				System.out.println();
				break;

			case QUIT:
				keepRunning = false;
				System.out.println("Ending Program");
				break;

			case UNKNOWN:
			default:
				System.out
						.println("Unknown command requested. Please try again!");
				break;
			}

		}

		/*
		 * Close Scanner
		 */
		get.close();

	}

}// end BinaryTreeView.java
