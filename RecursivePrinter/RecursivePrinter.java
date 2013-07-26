public class RecursivePrinter {

	char charValue;
	int depthValue;

	public RecursivePrinter() {
		this.charValue = '*';
		this.depthValue = 1;
	}

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
	 * This method prints the first half the pattern. The parameter "depthValue"
	 * needs to be equal to one. This method calls itself recursively to
	 * continue printing out the pattern. The base case is when the depthValue
	 * is equal to this.depthValue;
	 * 
	 * @param depthValue
	 */
	public void printUp(int depthValue) {

		for (int i = 0; i < depthValue; i++) {
			System.out.printf("%c", this.charValue);
		}

		System.out.println();

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

		for (int i = 0; i < depthValue; i++) {
			System.out.printf("%c", this.charValue);
		}

		System.out.println();

		if (depthValue == 0) {
			return;
		} else {
			printDown(depthValue - 1);
		}

	}

	/**
	 * This method prints out the pattern to the standard output by calling the
	 * methods printUp and printDown respectively.
	 * 
	 */
	public void print() {

		printUp(1);
		printDown(this.depthValue);

	}

}
