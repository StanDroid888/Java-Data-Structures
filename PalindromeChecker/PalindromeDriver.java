import java.util.Scanner;

/**
 * @author Stanley Wong This is the Driver Class to run the Palindrome Evaluator
 *         Program.
 * 
 */
public class PalindromeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		String userInputString;

		System.out.println("Please Enter your sentance now:");
		userInputString = get.nextLine();

		new PalindromeEvaluator(userInputString);

		get.close();

	}
}
