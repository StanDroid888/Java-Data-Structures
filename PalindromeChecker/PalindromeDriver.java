import java.util.Scanner;

/************************************************************************
* PROGRAMMER: Stanley Wong
* FILENAME:   PalindromeDriver.java
*
* DISCRIPTION: This is the Driver class for the PalindromeEvaluator.java 
* 			   class.
*           		
*************************************************************************/
public class PalindromeDriver {

	public void runDriver() {

		Scanner get = new Scanner(System.in);
		String userInputString = "";
		boolean runProgram = true;

		while (runProgram) {
			System.out
					.println("\nPlease Enter your sentance now (type \"exit\" to end program):");
			userInputString = get.nextLine();
			if (userInputString.contentEquals("exit")) {
				System.out.println("EXITING PROGRAM");
				break;
			}
			new PalindromeEvaluator(userInputString);

		}

		get.close();

	}

	public static void main(String[] args) {

		PalindromeDriver test1 = new PalindromeDriver();

		test1.runDriver();

	}
}
