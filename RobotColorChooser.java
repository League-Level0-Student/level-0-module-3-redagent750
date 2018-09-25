//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bat = new Robot();
		bat.setPenWidth(10);
		bat.penDown();
		bat.move(200);
		bat.turn(25);
		bat.move(200);
		bat.turn(25);
		bat.move(200);
		bat.turn(25);
		bat.move(200);
		bat.turn(25);
		String i = JOptionPane.showInputDialog("Which primary colors would you lie the robot to draw in?");
	
		if(i.equalsIgnoreCase("red")) {
			bat.setPenColor(255,0,0);
		}
		if(i.equalsIgnoreCase("yellow")) {
			bat.setPenColor(0,255,0);
		}	
		if(i.equalsIgnoreCase("blue")) {
			bat.setPenColor(0,0,255);
		}
		
		
		
		
		//3. Ask the user what color they would like the robot to draw	
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
       //7. Put a loop around your code so that you keep asking the user for more colors & drawing them		
		//4. Set the pen width to 10
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
