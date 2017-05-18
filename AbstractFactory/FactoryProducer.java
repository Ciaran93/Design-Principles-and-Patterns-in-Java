/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author 40111067
 */
public class FactoryProducer {
    
    // Factory producer gets the correct concrete factory to use
    public static AbstractCoffeeFactory getFactory(String choice){
        
        if(choice.equals("Coffee")){
            return new CoffeeFactory();
        } else {
            return new MilkFactory();
        }
    }
    
}
