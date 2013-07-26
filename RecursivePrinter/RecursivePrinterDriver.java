/**
 * 
 * Programmer: Stanley Wong
 * 
 * This is a driver for the RecursivePrinter class. 
 * 
 */
public class RecursivePrinterDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RecursivePrinter rp1 = new RecursivePrinter(20,'*');
		rp1.print();
		
		RecursivePrinter rp2 = new RecursivePrinter(40,'*');
		rp2.print();
		
		RecursivePrinter rp3 = new RecursivePrinter(-10,'*');
		rp3.print();
		
		RecursivePrinter rp4 = new RecursivePrinter();
		rp4.print();
		
		RecursivePrinter rp5 = new RecursivePrinter(0,'*');
		rp5.print();
	}

}
