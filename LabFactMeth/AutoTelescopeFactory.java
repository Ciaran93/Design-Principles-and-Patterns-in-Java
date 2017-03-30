package LabFactMeth;

public class AutoTelescopeFactory extends TelescopeFactory {

	@Override
	public Telescope createTelescope(String type) {
		if(type.equals("any")){
			
			return new AutoSkyPlusTelescope();
		} else 
		if(type.equals("super")){
			return new AutoSuperSkyTelescope();
		}
		else {
			return new AutoSkyPlusTelescope();
		}
	}

}
