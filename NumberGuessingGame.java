

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;


public class NumberGuessingGame {
	public static void main(String[] args) {
	Random num = new Random();
	int number = num.nextInt(2-1+1)+1;
 System.out.println(number);
	
	String user = JOptionPane.showInputDialog("Guess a number between 1,2, or 0.");
	
	System.out.println(num);
	int user2=Integer.parseInt(user);
	
	if(user2==number) {
		String answer = JOptionPane.showInputDialog(null,"You win, would you like to play again?");
	if(answer=="yes") {
		
	}
	else {
		System.exit(0);
	}
	}
	
if (user2<number) {
		JOptionPane.showInputDialog("One last chance, the number is greater than your answer!");
		if(user2==number) {
			JOptionPane.showMessageDialog(null,"You won with 2 guesses!");
		}
		else {
			JOptionPane.showMessageDialog(null,"You lost");
		}
	}
	
if(user2>number) {
	JOptionPane.showInputDialog("One last chance, the number is less than your answer!");
	if(user2==number) {
		JOptionPane.showMessageDialog(null,"You won with 2 guesses!");
	}
	else {
		JOptionPane.showMessageDialog(null,"You Lost");
	}
}
	
}}
