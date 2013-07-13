public class PalidromeEvaluator {

	String stringToEvaluate;
	String formattedString;
	boolean isPaladrome = false;
	Stack<Character> charStack = new Stack<Character>();

	public PalidromeEvaluator(String stringToEvaluate) {
		super();
		this.stringToEvaluate = stringToEvaluate;
		this.isPaladrome = false;
		formatString();
		fillStack();
		palidromeCheck();
	}

	private void palidromeCheck() {
		// TODO Auto-generated method stub
		this.isPaladrome = true;

		for (int i = 0; i < formattedString.length(); i++) {

			if (charStack.pop().getData() != formattedString.charAt(i)) {
				this.isPaladrome = false;
			}

		}

		if (this.isPaladrome) {
			System.out.println("\n\nYES, this is a PALIDROME");
		} else {
			System.out.println("\n\nNO, this is NOT PALIDROME");
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
		return "PalidromeEvaluator [stringToEvaluate=" + stringToEvaluate
				+ ", isPaladrome=" + isPaladrome + ", charStack=" + charStack
				+ "]";
	}

}
