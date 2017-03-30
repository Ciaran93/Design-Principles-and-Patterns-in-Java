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
public class PizzaMaker {
    
    public static void main(String[] args) {
        
        
        Pizza myPizza = new BBQSauce(new Mozzarella(new PlainPizza()));
        
        
        System.out.println("Ingredients: " + myPizza.getDescription() + " Cost: " + myPizza.getCost());
        
    }
    
}
