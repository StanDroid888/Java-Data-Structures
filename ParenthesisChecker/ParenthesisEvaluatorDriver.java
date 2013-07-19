import java.util.Scanner;

/**
 * @author Stanley Wong Driver for Parenthesis Evaluator
 */
public class ParenthesisEvaluatorDriver {

	/**
	 * This method runs the Parenthesis Evaluator program. The program will
	 * continues to run until user enters "exit" as input.
	 */
	public void runDriver() {

		Scanner get = new Scanner(System.in);
		String userInputString = "";
		boolean runProgram = true;

		while (runProgram) {
			System.out
					.println("\nPlease Enter your sentance now (type \"exit\" to end program):");
			userInputString = get.nextLine();
			if (userInputString.contentEquals("exit")) {
				System.out.println("EXITING PROGRAM");
				break;
			}
			new ParenthesisEvaluator(userInputString);

		}

		get.close();

	}

	/**
	 * main method for ParenthesisEvaluator program.
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		ParenthesisEvaluatorDriver test1 = new ParenthesisEvaluatorDriver();

		test1.runDriver();

	}

}
