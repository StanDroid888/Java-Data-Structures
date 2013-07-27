/**
 * 
 * Programmer: Stanley Wong
 * 
 * This program will convert a string of numbers as characters into the actual
 * numerical value.
 * 
 */
public class RecursiveDigitConverter {

	String digitsString;
	int depthValue;
	int convertedValue;

	/**
	 * Constructor with arguments
	 * 
	 */
	public RecursiveDigitConverter(String digitsString) {

		this.digitsString = digitsString;
		this.depthValue = digitsString.length();
		this.convertedValue = 0;
	}

	/**
	 * This method is used to calculate the numerical value of "convertedValue"
	 * via recursion. Each time the method is called recursively, the parameter
	 * which contains the index of a character in the digitsString is
	 * incremented by one to get to the next character. As each character is
	 * processed, the charIndex is used to determine what place value (base 10)
	 * is to be used. The integer 10 is raised to the the exponent of (the
	 * length of the digits string subtracted by the charIndex) and then that
	 * calculation is added to the "convertedValue" at each recursive call. The
	 * base case for this method is when the charIndex is equal to the length of
	 * the digits string to be evaluated. Since there is no character at that
	 * index, the method just returns.
	 * 
	 * @param charIndex (must start at zero)
	 */
	public void covertToInteger(int charIndex) {

		int tempInt = 0;
		Character tempChar;

		/*
		 * BASE CASE: 
		 * charIndex has incremented to the point that it is equal to
		 * the length of the digits string.
		 */
		if (charIndex == this.digitsString.length()) {
			return;
		} else {
			/*
			 * Continue recursively with a incremented
			 * value for charIndex. This conditional 
			 * will get the character at the charIndex then
			 * convert that character into its integer value.
			 */
			tempChar = this.digitsString.charAt(charIndex);
			tempInt = Character.getNumericValue(tempChar);

			/*
			 * Raise 10 to the power of the difference between the digits string's 
			 * length and the charIndex. Afterwards, multiple by the integer value
			 * which was received and add that product to the convertedValue attribute. 
			 */
			this.convertedValue = (int) (this.convertedValue + tempInt
					* Math.pow(10, this.digitsString.length() - charIndex - 1));

			/*
			 * Recursive call to continue
			 */
			covertToInteger(charIndex + 1);

		}
	}

	
	/**
	 * Getter to return converted value.
	 * @return
	 */
	public int getConvertedValue() {
		return convertedValue;
	}

}
