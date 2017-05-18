/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder1;

/**
 *
 * @author 40111067
 */
public class Customer {
    
    public static void main(String[] args) {
        
        // Instanciate Coffee builder
        CoffeeBuilder cb = new CoffeeBuilderImpl();
        
        //Instanciate Director, pass builder object to constructor
        CoffeeMakerDirector cmd = new CoffeeMakerDirector(cb);
        
        // call make Capp to make Cappuccino
        Coffee coffee = cmd.makeCapp();
        coffee.coffeeToString();

        // call makeEspresso to make espresso
        Coffee coffee1 = cmd.makeEspresso();
        coffee1.coffeeToString();

    }
    
}
