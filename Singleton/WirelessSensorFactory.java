package Singleton;

public class WirelessSensorFactory implements ISensorFactory {
	
	private static WirelessSensorFactory sensorFactory;
	
	private WirelessSensorFactory(){
		System.out.println("WIRELESS sensor factory");

	}

	@Override
	public IDoorSensor createDoorSensor() {
		System.out.println("Create WIRELESS door sensor");
		return new WirelessDoorSenseor();
	}

	@Override
	public IHeaterSensor createHeaterSensor() {
		System.out.println("Create WIRELESS heater sensor");
		return new WirelessHeaterSensor();
	}
	
	public static WirelessSensorFactory getWirelessFactory(){
		
		if(sensorFactory == null){
			sensorFactory = new WirelessSensorFactory();
		} 
		
		return sensorFactory;
		
	}
}
