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
public class BBQSauce extends ToppingsDecorator {
    
    public BBQSauce(Pizza pizza) {
        super(pizza);
        
        System.out.println("Adding sauce");
    }
    
    
     public String getDescription() {
        return tempPizza.getDescription() + ", BBQ sauces";
    }

    public double getCost() {
        return tempPizza.getCost() + 1.0;
    }    
    
}
