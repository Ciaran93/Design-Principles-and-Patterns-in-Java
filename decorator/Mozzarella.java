/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author 40111067
 */
public class Mozzarella extends ToppingsDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
        
        System.out.println("Adding dough");
        System.out.println("Adding moz");
    }
    
    
     public String getDescription() {
        return tempPizza.getDescription() + ", Mozzerella";
    }

    public double getCost() {
        return tempPizza.getCost() + 3.0;
    }
}
