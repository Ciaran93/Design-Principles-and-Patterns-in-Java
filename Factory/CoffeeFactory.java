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
public class CoffeeFactory {
    
    //Factory
    public Coffee getCoffee(String coffeeType){
        
        if(coffeeType == "Capp"){
            return new Cappuccino();
        } else {
            return new Latte();
        }
        
    }
    
}
