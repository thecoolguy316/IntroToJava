package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		System.out.println("hello world");
	Robot kevin=new Robot();
	kevin.setSpeed(500);
	kevin.penDown();	
	kevin.setPenColor(Color.red);	
	kevin.move(200);
	kevin.setPenColor(Color.green);
	kevin.turn(90);
	kevin.move(200);
	kevin.setPenColor(Color.blue);
	kevin.turn(90);
	kevin.move(200);
	kevin.setPenColor(Color.black);
	for(int i=0;i<4;i++) {
		kevin.move(200);
		kevin.turn(90);
	}
}
}
