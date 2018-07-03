//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] s) {
		// 3. Change this line to give you a random number between 1 - 100. 
		Random rand = new Random();
		int num  = rand.nextInt(100-1+1)+1;
		
		// 2. Print out the random variable above
		System.out.println(num);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
	String  user =JOptionPane.showInputDialog("Guess a number between 1-100.");
	
			System.out.println(num);
			int user2=Integer.parseInt(user);
			// 5. if the guess is correct
		if (user2==num) {
		JOptionPane.showMessageDialog(null,"you have guessed right, you won!");
		System.exit(0);
		}
			// 6. Win
		else if (user2<num) {
			JOptionPane.showInputDialog(null,"The number is too low, guess higher!");
		if (user2<num){
		JOptionPane.showInputDialog(null,"The number is still too low");
		}
		}
		if (user2>num) {
			JOptionPane.showInputDialog(null,"The number is to high, guess lower.");
			
		}
		
		// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


