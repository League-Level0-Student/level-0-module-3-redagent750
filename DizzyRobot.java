//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
	robot.setSpeed(50);

JOptionPane.showInputDialog("how many times do you want the robot to spin from 1-10?");
System.out.print(robot);
	robot.turn(360);
	dance(2);
	}
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.

 // 1. Use the dance method to make the robot spin.


	

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		
		}
	}
}

