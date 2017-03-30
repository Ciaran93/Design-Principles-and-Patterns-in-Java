package Builder;

public class Main {

	public static void main(String[] args) {
		
		RobotBuilder robotBuilder = new OldRobotBuilder(); 
		
		RobotDirector director = new RobotDirector(robotBuilder);
		director.makeRobot();
		Robot robot = director.getRobot();
	}

}
