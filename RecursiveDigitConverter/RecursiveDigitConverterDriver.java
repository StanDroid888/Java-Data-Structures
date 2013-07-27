/**
 * 
 * Programmer: Stanley Wong
 * 
 * This is a driver for the RecursiveDigitConverterDriver class.
 * 
 */
public class RecursiveDigitConverterDriver {

	public static void main(String[] args) {

		RecursiveDigitConverterDriver driver = new RecursiveDigitConverterDriver();
		driver.runIt();

	}

	public void runIt() {

		RecursiveDigitConverter dc1 = new RecursiveDigitConverter("1234");
		dc1.covertToInteger(0);
		System.out.println("This is the covertered value:"
				+ dc1.getConvertedValue());

		RecursiveDigitConverter dc2 = new RecursiveDigitConverter("1200256");
		dc2.covertToInteger(0);
		System.out.println("This is the covertered value:"
				+ dc2.getConvertedValue());

		RecursiveDigitConverter dc3 = new RecursiveDigitConverter("808080");
		dc3.covertToInteger(0);
		System.out.println("This is the covertered value:"
				+ dc3.getConvertedValue());

		/*
		 * Overflow
		 */
		RecursiveDigitConverter dc4 = new RecursiveDigitConverter(
				"327481704303198739021431098");
		dc4.covertToInteger(0);
		System.out.println("This is the covertered value:"
				+ dc4.getConvertedValue());

	}
}
