public class ParenthesisEvaluator {

	String stringToEvaluate;
	String formattedString;
	Stack<Character> charStack = new Stack<Character>();

	public ParenthesisEvaluator(String stringToEvaluate) {
		super();
		this.stringToEvaluate = stringToEvaluate;
		formatString();
		parenthesisStacker();

	}

	/**
	 * This method formats the user input string so that it can be used by the
	 * Palindrome Evaluator. The user input string is stripped of all characters
	 * that are not letters. Afterward, the method makes all the characters in
	 * the string upper case.
	 * 
	 */
	private void formatString() {
		formattedString = stringToEvaluate.replaceAll("[^a-zA-Z{}]", "")
				.toUpperCase();

		System.out.println("FORMATTED:" + formattedString);

	}

	/**
	 * This method pushes or pops the charStack based  
	 * on "{" or a  "}" is encountered. 
	 * 
	 */
	private void parenthesisStacker() {

		for (int i = 0; i < formattedString.length(); i++) {
			if ('{' == formattedString.charAt(i)) {
				charStack.push(formattedString.charAt(i));
			} else if ('}' == formattedString.charAt(i)) {
				if (charStack.isEmpty()) {
					System.out.println("Too many \"}\" !!");
					return;
				} else {
					charStack.pop();
				}

			}
		}// end of for loop

		// if the charStack is NOT empty,
		// then there were too many
		// left "{" parenthesis.
		if (!charStack.isEmpty()) {
			System.out.println("Too many \"{\" !!");
		}else{
			System.out.println("This line is Balanced.");
		}

	}

}// end class
