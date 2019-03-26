package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class  MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot mrbeast = new Robot();
	mrbeast.setSpeed(100);	
	mrbeast.penDown();
	for (int i=0;i<4;i++) {
	mrbeast.move(100);
	mrbeast.turn(100);
	mrbeast.sparkle();
	mrbeast.move(300);
	mrbeast.setSpeed(100);	
	mrbeast.penDown();
	mrbeast.move(100);
	mrbeast.turn(100);
	mrbeast.sparkle();
	mrbeast.move(300);mrbeast.setSpeed(100);	

		
	}
}
}