package FactoryMethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("WHAT SHIP? ( R / U");
		Scanner scan = new Scanner(System.in);
		EnemyShip ship;
		String option = null;
		
		if(scan.hasNextLine()){
			
			option = scan.nextLine();	
			System.out.println(option);
			
			FactoryMeth factory = new FactoryMeth();
			ship = factory.createShip(option);
			displayDetails(ship);
		}
		
		
		
		
		System.out.println(option);

	}
	
	public static void displayDetails(EnemyShip ship){
		System.out.println("IN HERE");
		System.out.println(ship.getName() + " Has " + ship.getDamage() + " damage.");
	}

}
