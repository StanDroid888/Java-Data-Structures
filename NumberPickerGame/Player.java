/**
 * Programmer: Stanley Wong
 * File: Player.java
 * Description: This class is the Player class used for the number picker game. 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
  
	int number;
	int guessCount; 
	protected static final int MAX = 1000;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public Player() {
	
		super();
		
		int randomNumber = (int)(Math.random() * MAX + 1);
		
		this.guessCount=0;
		this.number = randomNumber;
		System.out.println("Computer has picked the number: " + randomNumber);
		
	}
/**
 * Method: playGame
 * Description: This method starts the game for a player 
 */	
public void playGame(){
		
		int userAnswer;
		Scanner get = new Scanner(System.in);
		boolean found = false;
			
		while(!found){
				
		try{

			System.out.println("Please Enter your Guess: ");
			userAnswer = get.nextInt();
			guessCount += 1;

					
			if (userAnswer<1 || userAnswer > MAX){
				System.out.print("YOU NEED A NUMBER BETWEEN 1 and MAX.\n");
				System.out.print("Please enter another number: ");
				userAnswer = get.nextInt();
			}
			if (userAnswer == this.number){
				System.out.println("You've GOT it!");
				System.out.println("The number was " + this.number);
				System.out.println("It took " + guessCount + " guesses to get the answer.");
				found = true;
				get.close();
			}else if (userAnswer < this.number){
				System.out.println("Your Guess " + userAnswer + " is too LOW!");
			}else if (userAnswer > this.number){
				System.out.println("Your Guess " + userAnswer + " is too HIGH!");
			}	
			}catch(InputMismatchException e){ 
					System.out.println("Illegal type entered!!"); 
					System.exit(1);
			}// end try and catch
			 
		}// end While statement 
	

}// end playGame() 


}// end Player.java
	
