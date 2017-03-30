package Singleton;

public class SensorController {
	
	IDoorSensor doorSensor;
	IHeaterSensor heaterSensor;
	
	public SensorController(ISensorFactory factory){
		
		doorSensor = factory.createDoorSensor();
		heaterSensor = factory.createHeaterSensor();
	}
	
	
	public void start(){
		doorSensor.detect();
		heaterSensor.measure();
	}
}
