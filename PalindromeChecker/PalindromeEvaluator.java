public class PalindromeEvaluator {

	String stringToEvaluate;
	String formattedString;
	boolean isPalindrome = false;
	Stack<Character> charStack = new Stack<Character>();

	public PalindromeEvaluator(String stringToEvaluate) {
		super();
		this.stringToEvaluate = stringToEvaluate;
		this.isPalindrome = false;
		formatString();
		fillStack();
		PalindromeCheck();
	}

	private void PalindromeCheck() {
		// TODO Auto-generated method stub
		this.isPalindrome = true;

		for (int i = 0; i < formattedString.length(); i++) {

			if (charStack.pop().getData() != formattedString.charAt(i)) {
				this.isPalindrome = false;
			}

		}

		if (this.isPalindrome) {
			System.out.println("\n\nYES, this is a Palindrome");
		} else {
			System.out.println("\n\nNO, this is NOT Palindrome");
		}

	}

	private void formatString() {
		formattedString = stringToEvaluate.replaceAll("[^a-zA-Z]", "")
				.toUpperCase();

		System.out.println("FORMATTED:" + formattedString);

	}

	// fill the Stack with a formatted string
	private void fillStack() {

		for (int i = 0; i < formattedString.length(); i++) {
			charStack.push(formattedString.charAt(i));
		}

	}

	public String getStringToEvaluate() {
		return stringToEvaluate;
	}

	public void setStringToEvaluate(String stringToEvaluate) {
		this.stringToEvaluate = stringToEvaluate;
	}

	@Override
	public String toString() {
		return "PalindromeEvaluator [stringToEvaluate=" + stringToEvaluate
				+ ", isPalindrome=" + isPalindrome + ", charStack=" + charStack
				+ "]";
	}

}
