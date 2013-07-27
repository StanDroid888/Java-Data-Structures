/**
 * 
 * Programmer: Stanley Wong
 * 
 * This is a driver for the RecursivePrinter class.
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
		System.out.println("This is the covertered value:" + dc1.getConvertedValue());

	}
}
