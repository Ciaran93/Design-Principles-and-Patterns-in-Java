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
public abstract class ToppingsDecorator implements Pizza{
    
    protected Pizza tempPizza;
    
    public ToppingsDecorator(Pizza pizza){
        tempPizza = pizza;
    } 
    
    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }
    
    
}
