import java.util.InputMismatchException;
import java.util.Scanner;


public class NumberPicker {
  
	int number;
	int guessCount; 
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public NumberPicker() {
	
		super();
		
		int randomNumber = (int)(Math.random() * 1000 + 1);
		
		this.guessCount=0;
		this.number = randomNumber;
		System.out.println("Computer has picked the number: " + randomNumber);
		
	}
	
	public void playGame(){
		
			int userAnswer;
			Scanner get = new Scanner(System.in);
			boolean found = false;
			
			while(!found){
				
			try{

				System.out.println("Please Enter your Guess: ");
				userAnswer = get.nextInt();
				guessCount += 1;

					
				if (userAnswer<1 || userAnswer > 1000){
					System.out.print("YOU NEED A NUMBER BETWEEN 1 and 1000.\n");
					System.out.print("Please enter another number: ");
					userAnswer = get.nextInt();
				}
				if (userAnswer == this.number){
					System.out.println("You've GOT it!");
					System.out.println("The number was " + this.number);
					System.out.println("It took " + this.guessCount + " guesses to get the answer.");
					found = true;
					get.close();
				}else if (userAnswer < this.number){
					System.out.println("Your Guess " + userAnswer + " is too LOW!");
				}else if (userAnswer > this.number){
					System.out.println("Your Guess " + userAnswer + "is too HIGH!");
				}	

			}catch(InputMismatchException e){ 
					System.out.println("Illegal type entered: "); 
					System.exit(1);
			}// end try and catch
			 
		}// end While statement 
	

	}// end playGame() 


public void playGameAutomated(){
		
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



}// end NumberPicker.java
	
