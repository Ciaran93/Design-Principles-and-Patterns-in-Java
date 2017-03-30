package Factories;

public class HomeAstronomyRunner {

	public static void main(String[] args) {
		HomeAstronomer mySystem = new HomeAstronomer();
		TelescopeSimpleFactory factory = new TelescopeSimpleFactory();
		
		//test case 1
		Telescope telescope = factory.create(TelescopeSimpleFactory.Type.ANYSKYTELESCOPE);
		SkyCoordinates coords = new SkyCoordinates(100.1, 90.3, 13.4);
		telescope.setCoordinates(coords);
		mySystem.start(telescope);

		//test case 2
		Telescope telescope2 = factory.create(TelescopeSimpleFactory.Type.ANYSKYPLUSTELESCOPE);
		SkyCoordinates coords2 = new SkyCoordinates(100.1, 90.3, 13.4);
		telescope2.setCoordinates(coords2);
		mySystem.start(telescope2);
		
		
		//test case 1
		Telescope telescope1 = factory.create(TelescopeSimpleFactory.Type.ANYSUPERSKYTELESCOPE);
		SkyCoordinates coords1 = new SkyCoordinates(100.1, 90.3, 13.4);
		telescope1.setCoordinates(coords1);
		mySystem.start(telescope1);
	}
}

