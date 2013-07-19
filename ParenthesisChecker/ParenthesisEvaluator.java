/**
 * @author Stanley Wong This program check a user input string to determine if
 *         the parenthesis are balanced.
 * 
 */
public class ParenthesisEvaluator {

	String stringToEvaluate;
	String formattedString;
	Stack<Character> charStack = new Stack<Character>();

	/**
	 * @param stringToEvaluate
	 */
	public ParenthesisEvaluator(String stringToEvaluate) {
		super();
		this.stringToEvaluate = stringToEvaluate;
		formatString();
		parenthesisStacker();

	}

	/**
	 * This method formats a user input string by removing all characters which
	 * are not "(",")", or letters. Afterward, the string is capitalized.
	 */
	private void formatString() {
		formattedString = stringToEvaluate.replaceAll("[^a-zA-Z()]", "")
				.toUpperCase();
	}

	/**
	 * This method pushes or pops the charStack based after determining if the
	 * character read is a "(" or ")". If there is a pop() request when the
	 * charStack is empty, it means that there are too many right parenthesis
	 * "}". If the the charStack is not empty after evaluating the last
	 * character in the string, then it means that there are too many left
	 * parenthesis "(".
	 */
	private void parenthesisStacker() {

		for (int i = 0; i < formattedString.length(); i++) {
			if ('(' == formattedString.charAt(i)) {
				charStack.push(formattedString.charAt(i));
			} else if (')' == formattedString.charAt(i)) {

				// If charStack is empty, then there are too many ")"
				// and can't pop() anymore.
				if (charStack.isEmpty()) {
					System.out
							.println("\n\n------------------------------------");
					System.out.println("\"" + stringToEvaluate
							+ "\" is NOT BALANCED.");
					System.out.println("Unmatched \")\"");
					return;
				} else {
					charStack.pop();
				}

			}
		}// end of for loop

		// If charStack is empty at this point, then there are too many
		// "(" in the string.
		if (!charStack.isEmpty()) {
			System.out.println("\n\n------------------------------------");
			System.out.println("\"" + stringToEvaluate + "\" is NOT BALANCED.");
			System.out.println("Unmatched \"(\"");
		} else {
			System.out.println("\n\n------------------------------------");
			System.out.println("\"" + stringToEvaluate
					+ "\" has BALANCED parenthesis.");
		}

	}

}// end class
