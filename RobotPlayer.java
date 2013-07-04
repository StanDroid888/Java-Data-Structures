import java.util.InputMismatchException;
import java.util.Scanner;


public class RobotPlayer extends Player {
 
	
public void playGame(){
		
		int userAnswer;
		boolean found = false;
			
		userAnswer = (int)(Math.random() * 1000 + 1);
		guessCount += 1;

		while(!found){
				
		try{

			System.out.println("Guess: " + userAnswer + " Numbers of trys: " + this.guessCount );

			guessCount += 1;

					
			if (userAnswer == this.number){
				System.out.println("You've GOT it!");
				System.out.println("The number was " + this.number);
				System.out.println("It took " + this.guessCount + " guesses to get the answer.");
				found = true;

			}else if (userAnswer < this.number){
				System.out.println("Your Guess " + userAnswer + " is too LOW!");
				userAnswer = userAnswer + (int)((Math.random() * 1000) % (1000-userAnswer));

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
	
