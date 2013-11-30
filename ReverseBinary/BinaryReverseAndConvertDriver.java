/**
 * Programmer: Stanley Wong 
 * 
 * Description: Driver file to be used with BinaryReverseAndConvert.java
 */

import java.util.Scanner;

public class BinaryReverseAndConvertDriver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
		Scanner get = new Scanner(System.in);
		
		System.out.println("\nPlease Enter a Integer:");
		userInput = get.nextInt();
		
		BinaryReverseAndConvert myConverter = new BinaryReverseAndConvert(userInput);
		
		get.close();

	}

}
