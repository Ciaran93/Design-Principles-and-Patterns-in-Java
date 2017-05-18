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
public class CoffeeFactory extends AbstractCoffeeFactory {

    @Override
    public Milk makeMilk(String milkType) {
        return null;
    }

    @Override
    public Coffee makeCoffee(String coffeeType) {
        
        if(coffeeType.equals("Capp")){
            return new Cappuccino();
        } else {
            return new Latte();
        }
    }
    
}
