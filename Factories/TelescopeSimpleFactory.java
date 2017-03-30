package Factories;

public class TelescopeSimpleFactory {
	
	public enum Type {ANYSKYTELESCOPE, ANYSKYPLUSTELESCOPE,
		ANYSUPERSKYTELESCOPE};
		
		
	public Telescope create(Type type){
		
		if(type.equals(Type.ANYSKYTELESCOPE)){
			return new AnySkyTelescope();
		} else 
		if(type.equals(Type.ANYSUPERSKYTELESCOPE)){
			return new AnySuperSkyTelescope();
		}
		else {
			return new AnySkyPlusTelescope();
		}
		
	}

}
