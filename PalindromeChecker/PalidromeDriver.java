import java.util.Scanner;

public class PalidromeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		String userInputString;

		System.out.println("Please Enter your sentance now:");
		userInputString = get.nextLine();

		new PalidromeEvaluator(userInputString);
		
		get.close();

	}
}
