/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder2;

/**
 *
 * @author 40111067
 */
public class Demo {
    
    public static void main(String[] args) {
        
        // 2 types of pizza to be made
        PizzaBuilder cpb = new CheesePizzaBuilder();        
        PizzaBuilder ppb = new PepperoniPizza();

        // Director is passed correct builder
        WaiterDirector waiter = new WaiterDirector(cpb);
        waiter.makePizza();
        waiter.getPizza().PizzaToString();
        
        WaiterDirector waiter2 = new WaiterDirector(ppb);
        waiter2.makePizza();
        waiter2.getPizza().PizzaToString();

        
    }
    
}
