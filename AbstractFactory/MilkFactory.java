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
public class MilkFactory extends AbstractCoffeeFactory{

    @Override
    public Milk makeMilk(String milkType) {
        if(milkType.equals("Foam")){
            return new FoamMilk();
        } else {
            return new HotMilk();
        }
    }
    @Override
    public Coffee makeCoffee(String coffeeType) {
        return null;
    }
    
}
