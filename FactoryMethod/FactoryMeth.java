package FactoryMethod;

public class FactoryMeth {

	EnemyShip ship = null;
	public EnemyShip createShip(String option){
		
		if(option.equals("U")){
			ship = new UFOEnemyShip();
		} else 
			if(option.equals("R")){
				System.out.println("IN HERE2");
				ship = new RocketShip();
		}
		
		return ship;
		
	}
}
