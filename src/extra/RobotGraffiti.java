package extra;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot r=new Robot();
		r.setSpeed(1000);
		r.penDown();
		r.move(300);
		r.turn(180);
		r.move(150);
		r.turn(235);
		r.move(150);
		r.turn(180);
		r.move(150);
		r.turn(270);
		r.move(150);
		r.hide();
	}
	
}
