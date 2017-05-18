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
public class CoffeeMakerDirector {
    
    private CoffeeBuilder coffeeBuilder;
    
    public CoffeeMakerDirector(CoffeeBuilder coffeeBuilder){
        this.coffeeBuilder = coffeeBuilder;
    }
    
    public Coffee makeCapp(){
        
        return coffeeBuilder.setMilk("Froth").setName("Cappuccino").make();
    }
    
    public Coffee makeEspresso(){
        
        return coffeeBuilder.setMilk("no milk").setName("Espresso").make();
    }
}
