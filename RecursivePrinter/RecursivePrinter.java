/**
 * 
 * Programmer: Stanley Wong
 * 
 * This program prints out a pattern of characters in which the first line
 * contains one character. The next line (if needed) will contain two
 * characters. This pattern continues until the number of character printed on
 * one line is equal to the depth value specified as a argument in the
 * constructor. At that point, the pattern is reversed and each line has one
 * less character until only one character is printed on the last line.
 * 
 */
public class RecursivePrinter {

	char charValue;
	int depthValue;

	/**
	 * Constructor with default values
	 */
	public RecursivePrinter() {
		this.charValue = '*';
		this.depthValue = 1;
	}

	/**
	 * Constructor with arguments
	 * 
	 * @param depthValue
	 * @param charValue
	 */
	public RecursivePrinter(int depthValue, char charValue) {

		this.charValue = charValue;
		this.depthValue = Math.abs(depthValue);

		if (depthValue == 0) {
			System.out
					.println("Depth Value can't be Zero. Setting the depth to default value of one\n");
			this.depthValue = 1;
		} else if (depthValue < 0) {
			System.out.println("Depth Value should not be less than Zero.");
			System.out.println("Depth will be set to the absolute value of "
					+ depthValue);
		}

	}

	/**
	 * Getter for charValue
	 * @return
	 */
	public char getCharValue() {
		return charValue;
	}
	
	/**
	 * Getter for depthValue
	 * @return
	 */
	public int getDepthValue() {
		return depthValue;
	}
	
	/**
	 * This method prints out a line of characters which is "timesToPrint" in
	 * length.
	 * 
	 * @param timesToPrint
	 */
	private void printCharLine(int timesToPrint) {
		for (int i = 0; i < timesToPrint; i++) {
			System.out.printf("%c", this.charValue);
		}
		System.out.println();
	}

	/**
	 * This method prints both halves of the pattern. The parameter "depthValue"
	 * needs to be equal to one. This method calls itself recursively to
	 * continue printing out the pattern. The base case is when the depthValue
	 * is equal to this.depthValue. There are two calls to printCharLine(). The
	 * first call is executed right away, but the second call to printCharLine()
	 * does not occur till the recursion is completed.
	 * 
	 * @param depthValue
	 */
	public void print(int depthValue) {

		printCharLine(depthValue);

		// Base Case is when the depthValue is equal to this instance's
		// depthValue.
		if (depthValue == this.depthValue) {
			printCharLine(this.depthValue);
			return;
		} else {
			// Continue recursively until base case reached.
			print(depthValue + 1);
		}
		// This method call will not execute till recursion is completed.
		printCharLine(depthValue);

	}

	/**
	 * This method prints the first half the pattern. The parameter "depthValue"
	 * needs to be equal to one. This method calls itself recursively to
	 * continue printing out the pattern. The base case is when the depthValue
	 * is equal to this.depthValue.
	 * 
	 * @param depthValue
	 */
	public void printUp(int depthValue) {

		printCharLine(depthValue);

		if (depthValue == this.depthValue) {
			return;
		} else {
			printUp(depthValue + 1);
		}

	}


	/**
	 * This method prints the second half the pattern. The parameter
	 * "depthValue" needs to be equal to this.depthValue. This method calls
	 * itself recursively to continue printing out the pattern. The base case is
	 * when the depthValue is zero.
	 * 
	 * @param depthValue
	 */
	public void printDown(int depthValue) {

		printCharLine(depthValue);

		if (depthValue == 0) {
			return;
		} else {
			printDown(depthValue - 1);
		}
	}

}
