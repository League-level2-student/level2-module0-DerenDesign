package arrays;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) throws InterruptedException {
	Random ran = new Random();
	int move;
	boolean running = true;
	boolean stoped = false;
	//2. create an array of 5 robots.
	Robot[] Robots = new Robot[5];	
	//3. use a for loop to initialize the robots.
	for(int i = 0; i < 5; i++) {
		Robots[i] = new Robot();
		Robots[i].setX(i * 90 + 260);
		Robots[i].setY(455);
		Robots[i].setSpeed(10);
		
	}
	
	while(running == true) {
		for(int b = 0; b < Robots.length; b++) {
			if(Robots[b].getY() > 0) {
				running = true;
				
			}
			else {
				stoped = true;
				
				JOptionPane.showMessageDialog(null, "The Robot " + "#" + (b + 1) + " won the race! Great job robot!" );
				party();
				running = false;
				
			}
		}
		for(int a = 0; a < Robots.length; a++) {
			move = ran.nextInt(50);
			Robots[a].move(move);
		}
	}
		
	
	
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	
}
public static void party() throws InterruptedException {
		for(int p = 0; p < 100000000; p++) {
			Robot.setWindowColor(Color.RED);
			Thread.sleep(100);
			Robot.setWindowColor(Color.GREEN);
			Thread.sleep(100);
			Robot.setWindowColor(Color.BLUE);
			Thread.sleep(100);
			Robot.setWindowColor(Color.ORANGE);
			Thread.sleep(100);
			Robot.setWindowColor(Color.PINK);
		}
	}
}