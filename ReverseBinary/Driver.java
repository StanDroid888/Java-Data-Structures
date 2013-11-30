/**
 * Programmer: Stanley Wong 
 * 
 * Email: aeropunt@gmail.com 
 * 
 * Problem ID: reversebinary
 * 
 * Date: 8/23/2013
 * 
 * Description: Driver file to be used with BinaryReverseAndConvert.java
 */

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
		Scanner get = new Scanner(System.in);
		
		System.out.println("Reverse Binary Program \nby Stanley Wong \naeropunt@gmail.com");
		System.out.println("\nPlease Enter a Integer:");
		userInput = get.nextInt();
		
		BinaryReverseAndConvert myConverter = new BinaryReverseAndConvert(userInput);
		
		get.close();

	}

}
