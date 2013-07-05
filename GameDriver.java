/**
 * Programmer: Stanley Wong
 * File: GameDriver.java
 * Description: This class contains the main function to kick off the number picker game. 
 */
import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {
	
		
		int userChoice = 0;
		Scanner get = new Scanner(System.in);

		System.out.println("\nNumber Picker game.");
		System.out.println("Enter '1' for Automated Game");
		System.out.println("otherwise enter '0' for normal mode.\n");
		userChoice=get.nextInt();
		

		if(userChoice == 1){
			RobotPlayer player01 = new RobotPlayer();
			player01.playGame();}
		else{
			Player player01 = new Player();
			player01.playGame();}
       
	}

}
