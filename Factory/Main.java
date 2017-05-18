/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author 40111067
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Instanciate Coffee Factory
        CoffeeFactory factory = new CoffeeFactory();
        
        // Pass string to factory to tell it which coffee it makes
        // Returns type of coffee (Follows LSP)
        Coffee coffeeCap = factory.getCoffee("Capp");        
        Coffee coffeeLat = factory.getCoffee("Latte");
        
    }
}
