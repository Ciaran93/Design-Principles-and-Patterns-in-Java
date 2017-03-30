package Singleton;

public class WiredSensorFactory implements ISensorFactory {

	public WiredSensorFactory(){
		System.out.println("WIRED sensor factory");
	}

	@Override
	public IDoorSensor createDoorSensor() {
		System.out.println("Create WIRED door sensor");
		return new WiredDoorSensor();
	}

	@Override
	public IHeaterSensor createHeaterSensor() {
		System.out.println("Create WIRED heater sensor");
		// TODO Auto-generated method stub
		return new WiredHeaterSensor();
	}
}
