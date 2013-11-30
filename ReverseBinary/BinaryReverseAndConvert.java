/**
 * Programmer: Stanley Wong 
 * 
 * Email: aeropunt@gmail.com 
 * 
 * Problem ID: reversebinary
 * 
 * Date: 8/23/2013
 * 
 * Description: Reverse Binary class. 
 */

public class BinaryReverseAndConvert {

	Integer originalNumber;
	Integer newNumber;

	/**
	 * Constructor which takes the number to be converted as a argument.
	 */
	public BinaryReverseAndConvert(Integer originalNumber) {
		this.originalNumber = originalNumber;
		this.newNumber = 0;
		convertNumber(originalNumber);
	}

	/**
	 * This method will convert the original number to its new value by
	 * reversing the binary representation. This will be done by converting the
	 * original number first to a string which which represents the binary form.
	 * Then starting from the left, each bit is evaluated until the end of the
	 * string. Each time the bit is "ON," the newNumber will be increased by
	 * added (2 ^ (location of bit))
	 * 
	 */
	private void convertNumber(Integer numberToConvert) {

		String binaryString = Integer.toBinaryString(numberToConvert);
		System.out.println("Original number in Binary:" + binaryString);


		for (int i = 0; i < binaryString.length(); i++) {
			this.newNumber += Character.getNumericValue(binaryString.charAt(i))
					* (int) Math.pow(2, i);
		}

		System.out.println("New Number is:" + this.newNumber);

	}

}
