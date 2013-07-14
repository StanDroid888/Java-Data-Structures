/**
 * @author Stanley Wong This class is used to evaluate if a string of text is in
 *         fact a palindrome. A palindrome is a word, phrase, number, or other
 *         sequence of symbols or elements, which is the same reading from left
 *         to right as well as from right to left.
 * 
 */
public class PalindromeEvaluator {

	String stringToEvaluate;
	String formattedString;
	boolean isPalindrome = false;
	Stack<Character> charStack = new Stack<Character>();

	/**
	 * Constructor of the class which takes a string element as an argument. The
	 * constructor calls formatString() which formats the user input to a form
	 * which can be used for evaluation by the palindromCheck() method. The
	 * fillStack() method is also called by the constructor to prepare the for
	 * palindrome checking.
	 * 
	 */
	public PalindromeEvaluator(String stringToEvaluate) {
		super();
		this.stringToEvaluate = stringToEvaluate;
		this.isPalindrome = false;
		formatString();
		fillStack();
		palindromeCheck();
	}

	/**
	 * This method is used to evaluate if the string entered by the user is in
	 * fact a palindrome. This is done by popping off elements from the
	 * charStack one at a time. As each element is popped off the stack, it is
	 * compared to the character in the string which is in the (i)th location of
	 * the string.
	 * 
	 */
	private void palindromeCheck() {
		// TODO Auto-generated method stub
		this.isPalindrome = true;

		for (int i = 0; i < formattedString.length(); i++) {

			if (charStack.pop().getData() != formattedString.charAt(i)) {
				this.isPalindrome = false;
			}

		}

		if (this.isPalindrome) {
			System.out.println("\n\nYES,\"" + this.stringToEvaluate
					+ "\" is a Palindrome");
		} else {
			System.out.println("\n\nNO,\"" + this.stringToEvaluate
					+ "\" is NOT a Palindrome");
		}

	}

	/**
	 * This method formats the user input string so that it can be used by the
	 * Palindrome Evaluator. The user input string is stripped of all characters
	 * that are not letters. Afterward, the method makes all the characters in
	 * the string upper case.
	 * 
	 */
	private void formatString() {
		formattedString = stringToEvaluate.replaceAll("[^a-zA-Z]", "")
				.toUpperCase();

		System.out.println("FORMATTED:" + formattedString);

	}

	/**
	 * This method will fill the charStack with the user input string one
	 * character at a time.
	 * 
	 */
	private void fillStack() {

		for (int i = 0; i < formattedString.length(); i++) {
			charStack.push(formattedString.charAt(i));
		}

	}

}// end PalindromeEvaluator Class