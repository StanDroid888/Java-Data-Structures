/**
 * 
 * Programmer: Stanley Wong
 * 
 * This is a driver for the RecursivePrinter class.
 * 
 */
public class RecursivePrinterDriver {

	public static void main(String[] args) {

		RecursivePrinterDriver driver = new RecursivePrinterDriver();
		driver.runIt();

	}

	public void runIt() {
		RecursivePrinter rp1 = new RecursivePrinter(20, '*');
		System.out.println("Depth value: " + rp1.getDepthValue());
		rp1.print(1);

		RecursivePrinter rp2 = new RecursivePrinter(40, '*');
		System.out.println("Depth value: " + rp2.getDepthValue());
		rp2.print(1);

		RecursivePrinter rp3 = new RecursivePrinter(-10, '*');
		System.out.println("Depth value: " + rp3.getDepthValue());
		rp3.print(1);

		RecursivePrinter rp4 = new RecursivePrinter();
		System.out.println("Depth value: " + rp4.getDepthValue());
		rp4.print(1);

		RecursivePrinter rp5 = new RecursivePrinter(0, '*');
		System.out.println("Depth value: " + rp5.getDepthValue());
		rp5.print(1);

	}
}
