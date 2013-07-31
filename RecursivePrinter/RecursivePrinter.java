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
	 * 
	 * @return
	 */
	public char getCharValue() {
		return charValue;
	}

	/**
	 * Getter for depthValue
	 * 
	 * @return
	 */
	public int getDepthValue() {
		return depthValue;
	}

	/**
	 * This method prints out a line of characters which is "timesToPrint" in
	 * length. Each time a recursive call is made, a '*' is printed once. The
	 * base case is if the timeToPrint parameter is zero.
	 * 
	 * @param timesToPrint
	 */
	private void printCharLine(int timesToPrint) {

		/*
		 * Base Case is when timesToPrint is zero, otherwise just keep calling
		 * method recursively and print the character which is assigned the
		 * "charValue" each time through.
		 */
		if (timesToPrint > 0) {
			System.out.print(this.charValue);
			printCharLine(timesToPrint - 1);
		} else {
			System.out.println();
		}

		return;
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

}// end Recursive Printer Class
