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

	public void covertToInteger(int charIndex) {

		int tempInt = 0;
		Character tempChar;

		if (charIndex == this.digitsString.length()) {
			return;
		} else {
			tempChar = this.digitsString.charAt(charIndex);
			tempInt = Character.getNumericValue(tempChar);

			this.convertedValue = (int) (this.convertedValue + tempInt
					* Math.pow(10, this.digitsString.length() - charIndex - 1));

			covertToInteger(charIndex + 1);

		}
	}

	public int getConvertedValue() {
		return convertedValue;
	}

}
