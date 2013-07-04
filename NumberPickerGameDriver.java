import java.util.Scanner;


public class NumberPickerDriver {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner get = new Scanner(System.in);
		NumberPicker numPick1;
				
		numPick1 = new NumberPicker();
		numPick1.playGameAutomated();
		
		get.close();
		
       
	}

}
