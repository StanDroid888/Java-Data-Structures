/**
 * Programmer: Stanley Wong
 * File: RobotPlayer.java
 * Description: This class is the RobotPlayer class used for the number picker game. 
 * which extends the Player class.
 */
import java.util.InputMismatchException;

public class RobotPlayer extends Player {
 
/**
 * Method: playGame
 * Description: This method starts the game for a automated player. 
 */	
public void playGame(){
		
		int userAnswer;
		boolean found = false;
			
		userAnswer = (int)(Math.random() * MAX + 1);

		while(!found){
				
		try{
			guessCount += 1;
			System.out.println("Guess: " + userAnswer + " Numbers of trys: " + this.guessCount );
					
			if (userAnswer == this.number){
				System.out.println("You've GOT it!");
				System.out.println("The number was " + this.number);
				System.out.println("It took " + guessCount + " guesses to get the answer.");
				found = true;

			}else if (userAnswer < this.number){
				System.out.println("Your Guess " + userAnswer + " is too LOW!");
				userAnswer = userAnswer + (int)((Math.random() * MAX) % (MAX-userAnswer));

			}else if (userAnswer > this.number){
				System.out.println("Your Guess " + userAnswer + " is too HIGH!");
				userAnswer = (int)(Math.random() * userAnswer + 1);
			}	

			}catch(InputMismatchException e){ 
					System.out.println("Illegal type entered: "); 
					System.exit(1);
			}// end try and catch
			 
		}// end While statement 
	

	}// end playGame() 



}// end RobotPlayer.java
	
