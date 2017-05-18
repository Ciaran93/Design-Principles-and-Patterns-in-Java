package Singleton;
public interface ISensorFactory {

	public IDoorSensor createDoorSensor();
	public IHeaterSensor createHeaterSensor();
}
