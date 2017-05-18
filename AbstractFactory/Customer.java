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
public class Customer {
    public static void main(String[] args) {
        
        // Factory producer brings back correct factory
        AbstractCoffeeFactory coffeeFactory = FactoryProducer.getFactory("Coffee");        
        AbstractCoffeeFactory milkFactory = FactoryProducer.getFactory("Milk");
        
        //Use coffee factory to make my coffees
        Coffee coffee = coffeeFactory.makeCoffee("Capp");        
        Coffee coffee1 = coffeeFactory.makeCoffee("Latte");
        
        //Make coffee types
        coffee.makeCoffee();        
        coffee1.makeCoffee();
        
        //Use milk factory to make my milk
        Milk milk = milkFactory.makeMilk("Foam");        
        Milk milk1 = milkFactory.makeMilk("Hot");
        
        //Make Milk Types
        milk.makeMilk();        
        milk1.makeMilk();



        

        
        
        
    }
}
