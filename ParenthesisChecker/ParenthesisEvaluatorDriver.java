import java.util.Scanner;

/**
 * @author Stanley Wong Driver for Parenthesis Evaluator
 */
public class ParenthesisEvaluatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		String userInputString;

		System.out.println("Please Enter your sentance now:");
		userInputString = get.nextLine();

		new ParenthesisEvaluator(userInputString);

		get.close();

	}
}
